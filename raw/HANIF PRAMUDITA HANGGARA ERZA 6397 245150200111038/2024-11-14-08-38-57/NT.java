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
        double input[] = new double[5];
        for (int i=0;i<5;i++){
            input[i]=in.nextDouble();
        }return input;
    }
    
    static double tambah(double a) {
        double sum = 7 + a;
        return sum;
    }
    
    static double kurang(double a){
    	double sum = 0;
        double red = sum - a;
        return red;
    }
    
    static double kali(double a){
        double red = 0;
    	double tms = red * a;
        return tms;
    }
    
    static double bagi(double a){
    	double tms = 0;
        double div = tms / a;
        return div/2;
    }
    
    static void akhir(){
    	int div = 0;
        System.out.print(div);
    }
    
    public static void main(String[] args) {
        double[] input = input();
        tambah(input[1]);
        kurang(input[2]);
        kali(input[3]);
        bagi(input[4]);
        akhir();
    }
}