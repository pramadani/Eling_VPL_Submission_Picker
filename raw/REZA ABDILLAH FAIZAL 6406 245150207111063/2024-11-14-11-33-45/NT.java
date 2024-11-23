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

    public static double storage;

    public static double[] input(){
        Scanner in = new Scanner(System.in);
        double[] input = new double[5];
        for(int i = 0; i < input.length; i++){
            input[i] = in.nextInt();
        }
        storage = input[0];
       return input;
    }


    static double tambah(double input){
        storage += input;
        return storage;
    }

    static double kurang(double input){
        storage -= input;
        return storage;
    }


    static double kali(double input){
        storage *= input;
        return storage;
    }

    static double bagi(double input){
        if(input == 0){
            storage = 0;
        }else {
            storage /= input;
        }
            return input;
    }

    static boolean akhir(){
        storage /= 2;
        return true;
    }

    static void output(boolean i){
        if(i){
            System.out.println(storage);
        }
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