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
        tambah(input[1], input);
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
    public static double tambah (double input, double[] bil){
        
        return input + bil[0];
    }
    public static double kurang (double input){
        double hKurang = tambah(input[1], input);
        return hKurang - input;
    }
    public static double kali (double input){
        double hKali = kurang(input[2]);
        return hKali * input;
    }
    public static double bagi (double input) {
        double hBagi = kali(input[3]);
        return hBagi / input;
    }
    
    public static double akhir (){
        double hAkhir = bagi(input[4]);
        return hAkhir / 2;
    }
    
    public static double output(double akhir){
        System.out.println(akhir);
    }
    


}