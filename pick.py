import os
import shutil

source_dir = "raw"
target_dir = "final"

os.makedirs(target_dir, exist_ok=True)

for folder in os.listdir(source_dir):
    folder_path = os.path.join(source_dir, folder)
    
    if os.path.isdir(folder_path):
        latest_non_ceg_folder = None
        for subfolder in os.listdir(folder_path):
            subfolder_path = os.path.join(folder_path, subfolder)
            if os.path.isdir(subfolder_path) and not subfolder.endswith('.ceg'):
                if latest_non_ceg_folder is None or subfolder_path > latest_non_ceg_folder:
                    latest_non_ceg_folder = subfolder_path

        if latest_non_ceg_folder:
            target_folder_path = os.path.join(target_dir, folder)
            os.makedirs(target_folder_path, exist_ok=True)

            for item in os.listdir(latest_non_ceg_folder):
                item_path = os.path.join(latest_non_ceg_folder, item)
                if os.path.isdir(item_path):
                    shutil.copytree(item_path, os.path.join(target_folder_path, item))
                else:
                    shutil.copy2(item_path, target_folder_path)

            print(f"Copied contents from {latest_non_ceg_folder} to {target_folder_path}")
        else:
            print(f"No suitable folder found in {folder_path}")
