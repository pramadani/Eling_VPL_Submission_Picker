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
    public static double[] res = new double[5];

    public static double[] input() {
        Scanner input = new Scanner(System.in);
        res[0] = input.nextInt();
        res[1] = input.nextInt();
        res[2] = input.nextInt();
        res[3] = input.nextInt();
        res[4] = input.nextInt();
        return res;
    }
    
    public static void tambah(double in) {
        res[0] += in;
    }
    
    public static void kurang(double in) {
        res[0] -= in;
    }
    
    public static void kali(double in) {
        res[0] *= in;
    }
    
    public static void bagi(double in) {
        res[0] /= in;
    }
    
    public static double akhir() {
        return res[0] / 2;
    }
    
    public static void output(double in) {
        System.out.println(in);
    }
    
    public static void main(String[] args) {
        double[] input = input();
        tambah(input[1]);
        kurang(input[2]);
        kali(input[3]);
        bagi(input[4]);
        output(akhir());
    }
}