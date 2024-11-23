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
    static Scanner in = new Scanner(System.in);
    static double firstNum;
    public static double[] input(){
        double[] inputNum = new double[5];
        for(int i=0; i<5; i++){
            inputNum[i] = in.nextDouble();
        }
        firstNum = inputNum[0];
        return inputNum;
    }

    public static double tambah(double n){
        firstNum+=n;
        return firstNum;
    }

    public static double kurang(double n){
        firstNum-=n;
        return firstNum;
    }

    public static double kali(double n){
        firstNum*=n;
        return firstNum;
    }

    public static double bagi(double n){
        firstNum/=n;
        return firstNum;
    }

    public static double akhir(){
        return firstNum/2;
    }

    public static void output(double n){
        System.out.printf("%.2f\n", n);
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