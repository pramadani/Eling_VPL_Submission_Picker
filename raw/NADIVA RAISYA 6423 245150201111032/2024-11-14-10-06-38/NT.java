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
    private static double hasil;


    public static double[] input() {
        Scanner scanner = new Scanner(System.in);
        double[] input = new double[5];
        
        
        for (int i = 0; i < 5; i++) {
            input[i] = scanner.nextDouble();
        }
        
     
        hasil = input[0];
        return input;
    }
    private double angkaAwal;

   public static void tambah(double angkaAwal) {
        hasil += angkaAwal;
    }
public static void kurang(double angkaAwal) {
        hasil -= angkaAwal;
    }
    public static void kurang(double angkaAwal) {
        hasil *= angkaAwal;
    }
    public static void kurang(double angkaAwal) {
        hasil /= angkaAwal;
    }
    // [kode]>

    // <[kode]
    
   
    
}