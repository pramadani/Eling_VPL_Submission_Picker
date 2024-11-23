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

    public static void input() {
        Scanner in = new Scanner(System.in);
        double[] input = in.nextDouble();
    }

    public static double tambah(input[1]) {
        return input[0] += input[1];
    }
    
    public static double kurang(input[2]) {
        return input[0] -= input[2];
    }
    
    public static double kali(input[3]) {
        return input[0] /= input[3];
    }
    
    public static double bagi(input[4]) {
        return input[0] *= input[4];
    }
    
    public static double output(akhir()) {
        System.out.println(input[0] / 2);
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