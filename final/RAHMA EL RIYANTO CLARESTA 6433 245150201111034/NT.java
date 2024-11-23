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
    static double[] input;
    public static void main(String[] args) {
        input = input();
        tambah(input[1]);
        kurang(input[2]);
        kali(input[3]);
        bagi(input[4]);
        output(akhir());
    }
    
    public static double[] input(){
        double[] angka = new double[5];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < angka.length; i++){
            angka[i] = in.nextDouble();
        }
        double awal = angka[0];
        return angka;
    }
    
    
    public static double tambah(double input1){
        double awal = input[0];
        return awal + input1;
    }
    public static double kurang(double input2){
        double hTambah = tambah(input[1]);
        return hTambah - input2;
    }
    public static double kali(double input3){
        double hKurang = kurang(input[2]);
        return hKurang * input3;
    }
    public static double bagi(double input4){
        double hKali = kali(input[3]);
        return hKali / input4;
    }
    
    public static double akhir(){
        double nilaiAkhir;
        nilaiAkhir = bagi(input[4]) / 2;
        return nilaiAkhir;
    }
    
    public static void output(double akhir){
        System.out.println(akhir);
    }
}