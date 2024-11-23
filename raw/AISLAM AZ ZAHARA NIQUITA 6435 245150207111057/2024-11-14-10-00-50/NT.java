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
        Scanner input = new Scanner(System.in);
    
        System.out.print("Masukkan nilai awal: ");
        double nilai = input.nextDouble();
        
        System.out.print("Masukkan jumlah panjang array: ");
        int panjang = input.nextInt();
       
        double[] array = new double[panjang];
      
        for (int i = 0; i < panjang; i++) {
            System.out.print("Masukkan parameter ke-" + (i + 1) + ": ");
            array[i] = input.nextDouble();
        }

        double hasil = nilai;
        for (int i = 0; i < array.length; i++) {
            switch (i % panjang) {
                case 0 -> 
                    hasil = pertambahan(hasil, array[i]);
                case 1 -> 
                    hasil = pengurangan(hasil, array[i]);
                case 2 -> 
                    hasil = perkalian(hasil, array[i]);
                case 3 -> 
                    hasil = pembagian(hasil, array[i]);
            }
        }
        double hasilakhir = hasil / 2;
        
        input.close(); 
    }

    private static double pertambahan(double a, double b) {
        return a + b;
    }

    private static double pengurangan(double a, double b) {
        return a - b;
    }

    private static double perkalian(double a, double b) {
        return a * b;
    }

    private static double pembagian(double a, double b) {
        return a / b;
    }

      private static void hasilakhir(double hasil) {
        System.out.printf("Hasil akhir: %.2f%n", hasil);
    }
}

       
    }
}