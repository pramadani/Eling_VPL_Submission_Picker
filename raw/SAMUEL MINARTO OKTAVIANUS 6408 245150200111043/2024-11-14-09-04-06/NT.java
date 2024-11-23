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

   static double awal;
    static double[] input () {
        Scanner in = new Scanner (System.in);
        double inp[] = new double[5];
        inp[0] = in.nextDouble();
        inp[1] = in.nextDouble();
        inp[2] = in.nextDouble();
        inp[3] = in.nextDouble();
        inp[4] = in.nextDouble();
        awal = inp[0];
        return inp;
    }
    static double tambah(double x) {
        awal+=x;
        return awal;
    }
    static double kurang(double x) {
        awal-=x;
        return awal;
    }
    static double kali(double x) {
        awal*=x;
        return awal;
    }
    static double bagi(double x) {
        awal/=x;
        return awal;
    }
    static double akhir() {
        awal/=2.0;
        return awal;
    }
    static void output(double x){
        System.out.printf("%.2f",x);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] input = input();
        tambah(input[1]);
        kurang(input[2]);
        kali(input[3]);
        bagi(input[4]);
        output(akhir());
    }
}