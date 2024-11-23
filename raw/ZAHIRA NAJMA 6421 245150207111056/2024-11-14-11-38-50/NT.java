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
        double[] nilaiMasuk = new double[5];
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
        return nilaiMasuk; 
    }
    
    public static void tambah(double nilai) {
        save += nilai;
    }

    public static void kurang(double nilai) {
        save -= nilai;
    }

    public static void kali(double nilai) {
        save *= nilai;
    }

    public static void bagi(double nilai) {
        save /= nilai;
    }

    public static double hitungAkhir() {
        return save / 2;
    }

    public static void tampilkanHasil(double hasil) {
        System.out.printf("%.2f\n", hasil);
    }

    public static void main(String[] args) {
        double[] input = Input();
        tambah(input[1]);
        kurang(input[2]); 
        kali(input[3]);
        bagi(input[4]);
        tampilkanHasil(hitungAkhir());
    }
}
