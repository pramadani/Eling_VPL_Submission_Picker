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
        double[] input = input();
        tambah(input[1], input);
        kurang(input[2], input);
        kali(input[3], input);
        bagi(input[4], input);
        output(akhir(input));
    }
    public static double [] input(){
        double[] nilai = new double[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            nilai [i] = in.nextDouble();
         
         
    }
    return nilai;
    }
    public static double tambah (double input, double[] bil){
        return input + bil[0];
    }
    public static double kurang (double input, double[] bil){
        double pengurangan = tambah(bil[1], bil);
        return pengurangan - input;
    }
    public static double kali (double input, double[] bil){
        double perkalian = kurang(bil[2], bil);
        return perkalian * input;
    }
    public static double bagi (double input, double[] bil) {
        double pembagian = kali(bil[3], bil);
        return pembagian / input;
    }
    
    public static double akhir (double[] bil){
        double nilaiakhir = bagi(bil[4], bil);
        return nilaiakhir / 2;
    }
    
    public static void output(double akhir){
        System.out.println(akhir);
    }
    


}