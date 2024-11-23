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

    public static double[] input(){
        Scanner in =new Scanner(System.in);
        double[] input = new double[5];
        for(int i = 0; i < input.length; i++){
            input[i] = in.nextInt();
        }
       return input;
    }


    public static double tambah(double input){
        input[0] += input[1];
        return input;
    }

    public static double[] kurang(double[] input){
        input[0] -= input[2];
        return input;
    }


    public static double[] kali(double[] input){
        input[0] *= input[3];
        return input;
    }

    public static double[] bagi(double[] input){
        input[0] /= input[4];
        return input;
    }

//    public static void
//
//    public static void akhir(){
//        System.out.println(input[0]);
//    }



    public static void main(String[] args) {
        double[] input = input();
        tambah(input[1]);
        kurang(input[2]);
        kali(input[3]);
        bagi(input[4]);
        System.out.println(input[0]);
//        output(akhir());
    }
}