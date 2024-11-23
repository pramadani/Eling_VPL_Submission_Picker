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
		Scanner input = new Scanner(System.in);
        double a[] = new double[5];
        for (int i=0;i<5;i++){
            a[i]=input.nextDouble();
        }return a;
    }
    
    static double tambah(double input[]){
        double sum = input[0] + input[1];
        return sum;
    }
    
    static double kurang(double input[]){
    	double sum = 0;
        double red = sum - input[2];
        return red;
    }
    
    static double kali(double input[]){
        double red = 0;
    	double tms = red * input[3];
        return tms;
    }
    
    static double bagi(double input[]){
    	double tms = 0;
        double div = tms / input[4];
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
        output(akhir());
    }
}