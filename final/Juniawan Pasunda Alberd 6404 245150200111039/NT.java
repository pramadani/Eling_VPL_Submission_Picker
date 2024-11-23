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
    static double[] input = new double[5];
    static double hasil=0;
    
    public static double[] input(){
    	Scanner beto = new Scanner(System.in);
    	for(int i=0; i<5; i++){
    		input[i] = beto.nextDouble();
    	}
    	return input;
    }
    
    public static double tambah(double x){
        return hasil=input[0]+x;
    }
    
    public static double kurang(double x){
        return hasil-=x;
    }
    
    public static double kali(double x){
        return hasil*=x;
    }
    
    public static double bagi(double x){
        return hasil/=x;
    }
    
    public static double akhir(){
        return hasil/=2;
    }
    
    public static void output(double x){
    	System.out.printf("%.2f", x);
    }

    // <[kode]
    
    public static void main(String[] args) {
        double[] input = input();
        tambah(input[1]);
        kurang(input[2]);
        kali(input[3]);
        bagi(input[4]);
        output(akhir());
    }
}