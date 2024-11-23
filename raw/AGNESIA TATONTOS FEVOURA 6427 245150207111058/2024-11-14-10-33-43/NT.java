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
    
    public static void main(String[] args) {
        double input [] = input();
        tambah(input[1]);
        kurang(input[2]);
        kali(input[3]);
        bagi(input[4]);
        output(akhir());
    }
    public static double [] input(){
        input = new input[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            input [i] = in.nextDouble();
         return input;
         
    }
    static double awal = input[0];
    
    
    }
    public static double tambah (double input){
        return input + tambah;
    }
    public static double kurang (double input){
        return input - kurang;
    }
    public static double kali (double input){
        return input * kali;
    }
    public static double bagi (double input) {
        return input / bagi;
    }
    
    


}