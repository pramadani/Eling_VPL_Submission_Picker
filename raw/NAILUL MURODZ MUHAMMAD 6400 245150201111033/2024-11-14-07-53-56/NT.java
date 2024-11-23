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
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] input = input();
        tambah(input[1]);
        kurang(input[2]);
        kali(input[3]);
        bagi(input[4]);
        output(akhir());
    }
    private static double[] input(input[]){
        double input
    }
    private static int tambah(int n){
        if (n==1)
            return 1;
        else
            return (n * faktorialN(n-1));
    }
    private static int kurang(int g){
        if (g==1)
            return 1;
        else
            return (g * faktorialG(g-1));
    }
    private static int  kali(int r){
        if (r==1)
            return 1;
        else
            return (r * faktorialR(r-1));
    }
     private static int  bagi(int input){
        if (r==1)
            return 1;
        else
            return (r * faktorialR(r-1));
    }
        
        
        
    }
}