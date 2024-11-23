#!/bin/bash

source_dir="raw"
target_dir="final"

mkdir -p "$target_dir"

for folder in "$source_dir"/*; do
    latest_non_ceg_folder=$(find "$folder" -type d ! -name "*.ceg" | sort | tail -n 1)

    parent_folder=$(basename "$folder")

    if [ -n "$latest_non_ceg_folder" ] && [ -d "$latest_non_ceg_folder" ]; then
        mkdir -p "$target_dir/$parent_folder"

        cp -r "$latest_non_ceg_folder"/* "$target_dir/$parent_folder/"

        echo "Copied contents from $latest_non_ceg_folder to $target_dir/$parent_folder"
    else
        echo "No suitable folder found in $folder"
    fi
done
