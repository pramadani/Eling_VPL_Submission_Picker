/* 
 * 1. Harus menggunakan template yang disediakan.
 * 2. Wajib meletakkan kode logic yang sesuai dengan nama method.
 * 3. Wajib mengimplementasikan semua method.
 * 4. Satu method hanya boleh handle 1 tipe logic.
 * 5. Hanya boleh meletakkan kode pada kolom yang disediakan.
 * 6. Tidak diperbolehkan mengubah method main.
 */
import java.util.Scanner;

public class Fight {

    private static double save;
    public static double[] Input() {
        Scanner scanner = new Scanner(System.in);
        double[] nilaiMasuk = new double[5]
        String[] prompts = {
            "Masukkan angka awal: ",
            "Masukkan angka tambah: ",
            "Masukkan angka kurang: ",
            "Masukkan angka kali: ",
            "Masukkan angka bagi: "
        };
    for (int i = 0; i < prompts.length; i++) {
        System.out.print(prompts[i]);
        nilaiMasuk[i] = scanner.nextDouble();
        } 
        save = nilaiMasuk[0];  
        kembalikan nilaiMasuk; 
        
    }
}