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

   public static void main(String[] args) {
        double[] input = input();
        tambah(input[1], input);
        kurang(input[2],input);
        kali(input[3],input);
        bagi(input[4],input);
        output(akhir(input));
    }
    
    static double[] input () {
        Scanner in = new Scanner (System.in);
        double inp[] = new double[5];
        inp[0] = in.nextDouble();
        inp[1] = in.nextDouble();
        inp[2] = in.nextDouble();
        inp[3] = in.nextDouble();
        inp[4] = in.nextDouble();
        return inp;
    }

    static double[] tambah(double x,double[]k){
        k[0]+=x;
        return k;
    }
    static double[] kurang(double x,double []k){
        k[0]-=x;
        return k;
    }
    static double[] kali(double x,double[] k){
        k[0]*=x;
        return k;
    }
    static double[] bagi(double x, double[] k){
        k[0]/=x;
        return k;
    }

    static double[] akhir(double [] k) {
        k[0]/=2;
        return k;
    }
    static void output(double[] k){
        System.out.printf("%.2f",k[0]);
    }
}