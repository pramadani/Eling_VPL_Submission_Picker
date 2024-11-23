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
    static double[] input = new double[5];

     static double[] input() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            input[i] = in.nextDouble();
        }
        return input;
     }
     
     static double tambah(double n) {
        return input[0] + n;
     }

     static double kurang(double n) {
        return tambah(input[1]) - n;
     }

     static double kali(double n) {
        return kurang(input[2]) * n;
     }

     static double bagi(double n) {
        return kali(input[3]) / n;
     }

     static double akhir() {
        return bagi(input[4]) / 2;
     }

     static void output(double n) {
        System.out.printf("%.2f", n);
     }
     
     // <[kode]
     
     public static void main(String[] args) {
         double[] input = input();
         tambah(input[1]);
         kurang(input[2]);
         kali(input[3]);
         bagi(input[4]);
         output(akhir());
     }
 }