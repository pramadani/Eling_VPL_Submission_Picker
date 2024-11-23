

import java.util.Scanner;

public class NT {
     private static double nilaiAwal; 
    private static double[] array;
    private static double[] input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai awal: ");
        double nilai = input.nextDouble();
    
        array = new double[4]; 
        for (int i = 0; i < 4; i++) {
            System.out.print("");
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
     hasil /= 2;
     hasilakhir(hasil);
        
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
        System.out.printf("%.2f%n", hasil);
    }
}

    
