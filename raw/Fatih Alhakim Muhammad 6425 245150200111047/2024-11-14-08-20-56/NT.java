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
      static double jumlah =0;
     // <[kode]
     
     public static void main(String[] args) {
         double[] input = input();
         tambah(input[1]);
         kurang(input[2]);
         kali(input[3]);
         bagi(input[4]);
         output(akhir());
     }
     public static double[] input (){
        Scanner in = new Scanner(System.in);
         double[] arr = new double[6];
         for(int i = 0; i < 5; i++){
          arr[i] = in.nextDouble();
          
         }
         jumlah=arr[0];
          return arr;
     }
     public static void tambah (double n){
      jumlah += n;
     }
     public static void kurang (double n){
      jumlah -= n;
     }
     public static void kali (double n){
      jumlah *= n;
     }
     public static void bagi (double n){
      jumlah /= n;
     }
     public static double akhir (){
      return jumlah/=2;
     }
     public static void output (double n){
      System.out.println(n);
     }
 }