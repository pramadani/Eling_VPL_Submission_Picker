/* 
 * 1. Harus menggunakan template yang disediakan.
 * 2. Wajib meletakkan kode logic yang sesuai dengan nama method.
 * 3. Wajib mengimplementasikan semua method.
 * 4. Satu method hanya boleh handle 1 tipe logic.
 * 5. Hanya boleh meletakkan kode pada kolom yang disediakan.
 * 6. Tidak diperbolehkan mengubah method main.
 */

import java.util.Scanner;

public class NT {

    // [kode]>
    static double a;
    // <[kode]
    
    public static void main(String[] args) {
        double[] input = input();
        tambah(input[1]);
        kurang(input[2]);
        kali(input[3]);
        bagi(input[4]);
        output(akhir());
    }
    
    static double[] input() {
        Scanner input = new Scanner(System.in);
        double[] data = {
            input.nextDouble(),
            input.nextDouble(),
            input.nextDouble(),
            input.nextDouble(),
            input.nextDouble()
        };
        
        a = data[0];
        return data;
    }
    
    static void tambah(double b) { a += b; }
    static void kurang(double b) { a -= b; }
    static void kali(double b) { a *= b; }
    static void bagi(double b) { a /= b; }
    static void output(double b) {
        System.out.printf("%.2f", b);
    }
    static double akhir() {
        return a / 2;
    }
}