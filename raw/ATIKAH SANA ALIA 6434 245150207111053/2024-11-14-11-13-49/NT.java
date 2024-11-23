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

    // <[kode]
    
    // public static void main(String[] args) {
    //     double[] input = input();
    //     tambah(input[1]);
    //     kurang(input[2]);
    //     kali(input[3]);
    //     bagi(input[4]);
    //     output(akhir());
    // }
    public static double tambah(double n, double m){
        return n+m;
    }
    public static double kurang(double n, double m){
        return n-m;
    }
    public static double kali(double n, double m){
        return n*m;
    }
    public static double bagi(double n, double m){
        return n/m;
    }
    public static double input(){
        Scanner s = new Scanner(System.in);
        double angka = s.nextDouble();
        return angka;
    }
     public static void main(String[] args) {
         double awal = input();
         double hasil = tambah(awal, input());
         hasil = kurang(hasil, input());
         hasil = kali(hasil, input());
         hasil = bagi(hasil, input());
         hasil /= 2;
         System.out.println(hasil);
     }
}