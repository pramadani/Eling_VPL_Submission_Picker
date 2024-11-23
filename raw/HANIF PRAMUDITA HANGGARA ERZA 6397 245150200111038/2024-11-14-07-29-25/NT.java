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
        double a[] = new double[5];
        for (int i=0;i<5;i++){
            a[i]=input.nextDouble;
        }
    }
    
    static double tambah(int a){
        double sum = a[0] + a[a];
        return sum;
    }
    
    static double kurang(int a){
        double = sum - a[a];
        return red;
    }
    
    static double kali(int a){
        double tms = red * a[a];
        return tms;
    }
    
    static double bagi(int a){
        double div = tms / a[a];
        return div;
    }
    
    static void akhir(){
        System.out.print(div);
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