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

    static double[] input;
	static double hasil;
	static double[] input(){
		Scanner in = new Scanner(System.in);
        double input[] = new double[5];
        for (int i=0;i<5;i++){
            input[i]=in.nextDouble();
        }return input;
    }
    
    static double tambah(double a) {
        hasil += a;
        return hasil;
    }
    
    static double kurang(double a){
    	hasil -= a;
        return hasil;
    }
    
    static double kali(double a){
    	hasil *= a;
        return hasil;
    }
    
    static double bagi(double a){
    	hasil /= a;
        return hasil;
    }
    
    static String akhir(){
    	return String.valueOf(hasil);
    }
    
    static void output(String a) {
    	System.out.println(a);
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