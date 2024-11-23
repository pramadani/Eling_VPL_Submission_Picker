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

    static double[] input(){
        Scanner in = new Scanner(System.in);
        double [] isi = {
            (in.nextDouble()),
            (in.nextDouble()),
            (in.nextDouble()),
            (in.nextDouble()),
            (in.nextDouble()),
        };
        return isi;
    }

    static double[] tambah(double input){
        double[] hasil = {0};
        hasil[0] += input[1];
        return hasil;
    }

    static double[] kurang(double input){
            double[] hasil = {0};
            hasil[0] -= input[1];
        return hasil;
    }

    static double[] kali(double input){
            double[] hasil = {0};
            hasil[0] *= input[1];
        return hasil;
    }

    static double[] bagi(double input){
            double[] hasil = {0};
            hasil[0] /= input[1];
    }

    static boolean akhir(){

    }

    static void output(){
        System.out.println(akhir());
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