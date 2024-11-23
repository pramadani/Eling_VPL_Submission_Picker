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
    
    public static void main(String[] args) {
        double[] input = input();
        
        tambah(input[1]);
        kurang(input[2]);
        kali(input[3]);
        bagi(input[4]);
        output(akhir());
    }
    public static double[] input(){
        Scanner in = new Scanner(System.in);
        double[] angka = new double[5];
        angka[0] = in.nextDouble();
        angka[1] = in.nextDouble();
        angka[2] = in.nextDouble();
        angka[3] = in.nextDouble();
        angka[4] = in.nextDouble();
        return angka;
    }
    
    public static void tambah(double input1){
        double[] angka = input();
        double awal = angka[0];
        double hTambah = awal - input1;
    }
    
    public static void kurang(double input2){
        double[] angka = input();
        double awal = angka[0];
        double hKurang = awal - input2;
    }
    
    public static void kali(double input3){
        double[] angka = input();
        double awal = angka[0];
        double hKali = awal * input3;
    }
    
    public static void bagi(double input4){
        double[] angka = input();
        double awal = angka[0];
        double hBagi = awal / input4;
    }
    
    public static void output(){
        
    }
}