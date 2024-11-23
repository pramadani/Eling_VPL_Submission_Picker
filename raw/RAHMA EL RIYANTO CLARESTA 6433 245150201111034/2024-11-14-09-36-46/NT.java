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
    static double[]input;
    public static void main(String[] args) {
        input = input();
        tambah(input[1], input[0]);
        kurang(input[2], input[0]);
        kali(input[3], input[0]);
        bagi(input[4], input[0]);
        output(akhir(input[0]));
    }
    
    public static double[] input(){
        double[] angka = new double[5];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < angka.length; i++){
            angka[i] = in.nextDouble();
        }
        return angka;
    }
    
    
    public static double tambah(double input1, double awal){
        return awal + input1;
    }
    public static double kurang(double input2, double awal){
        return awal - input2;
    }
    public static double kali(double input3, double awal){
        return awal * input3;
    }
    public static double bagi(double input4, double awal){
        return awal / input4;
    }
    
    public static double akhir(double awal){
        double nilaiAkhir;
        double h1 = tambah(input[1], input[0]);
        double h2 = kurang(input[2], h1);
        double h3 = kali(input[3], h2);
        double hAkhir = bagi(input[4], h3) / 2;
        return hAkhir;
    }
    
    public static void output(double akhir){
        System.out.println(akhir);
    }
}