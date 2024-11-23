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
    static double angkaawal = 0;
    public static double[] input() {
        Scanner in = new Scanner(System.in);
        double[] input = new double[5];
        for (int i = 0; i < input.length; i++) {
            input[i] = in.nextDouble();
        }
        return input;
    }

    public static double tambah(double input) {
        return angkaawal += input;
    }
    
    public static double kurang(double input) {
        return angkaawal -= input;
    }
    
    public static double kali(double input) {
        return angkaawal *= input;
    }
    
    public static double bagi(double input) {
        return angkaawal /= input;
    }
    
    public static double akhir() {
        return angkaawal / 2.0;
    }

    public static void output(double akhir) {
        System.out.printf("%.2", akhir);
    }

    
    public static void main(String[] args) {
        double[] input = input();
        angkaawal = input[0];
        tambah(input[1]);
        kurang(input[2]);
        kali(input[3]);
        bagi(input[4]);
        output(akhir());
    }
}