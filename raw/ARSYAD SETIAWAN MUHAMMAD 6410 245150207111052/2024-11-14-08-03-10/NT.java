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
    static double angka = 0;
    
    public static void main(String[] args) {
        double[] input = input();
        tambah(input[1]);
        kurang(input[2]);
        kali(input[3]);
        bagi(input[4]);
        output(akhir());
        angka = input[0];
        
    }
    public static double tambah(double input1){
        return angka+=input1;
    }
    public static double kurang(double input2){
        return angka -=input2;
    }
    public static double kali(double input3){
        return angka *= input3;
    }
    public static double bagi(double input4){
        return angka /= input4;
    }
    public static double akhir(){
        return angka/2;
    }
    public static void output(double n){
        System.out.println( n);
    }
   
}