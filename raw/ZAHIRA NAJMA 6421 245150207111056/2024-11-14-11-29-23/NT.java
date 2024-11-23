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
        double[] nilaiMasuk = {7,1,2,3,4}
        String[] prompts = {
            "Masukkan angka awal: ",
            "Masukkan angka tambah: ",
            "Masukkan angka kurang: ",
            "Masukkan angka kali: ",
            "Masukkan angka bagi: "
        };
    public static void main(String[] args) {
        double[] input = input();
        tambah(input[1]);
        kurang(input[2]);
        kali(input[3]);
        bagi(input[4]);
        output(akhir());
    }
}