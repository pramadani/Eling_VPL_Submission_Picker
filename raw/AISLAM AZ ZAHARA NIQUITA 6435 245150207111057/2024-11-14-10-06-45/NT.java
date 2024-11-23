

import java.util.Scanner;

public class NT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        double nilai = input.nextDouble();;
        int panjang = input.nextInt();
        double[] array = new double[panjang];
      
        for (int i = 0; i < panjang; i++) {
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
        System.out.printf("%.2f%n", hasil);
    }
}

    
