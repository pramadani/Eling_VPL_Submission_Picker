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

    static double tambah(double input){
        return input + input;
    }

    static double kurang(double input){
        return input - input;
    }

    static double kali(double input){
        return input * input;
    }

    static double bagi(double input){
        return input / input;
    }
    
    static void akhir (String output){
        System.out.println(output);
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