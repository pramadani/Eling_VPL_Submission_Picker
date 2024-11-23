

import java.util.Scanner;

    public class NT {
    private static double nilaiAwal; 
    private static double[] array;

    private static double[] input() {
        Scanner input = new Scanner(System.in);
      
        nilaiAwal = input.nextDouble();
        
        
        array = new double[4]; 
        for (int i = 0; i < 4; i++) {
            System.out.print("");
            array[i] = input.nextDouble(); 
        }

        return new double[]{nilaiAwal, array[0], array[1], array[2], array[3]};
    }
    private static double tambah(double a, double b) {
        return a + b;
    }
    private static double kurang(double a, double b) {
        return a - b;
    }
    private static double kali(double a, double b) {
        return a * b;
    }
    private static double bagi(double a, double b) {
        if (b == 0) {
            return 0; 
        }else{
        return nilaiAwal / b;
    }

    private static void output(double hasil) {
        System.out.printf("%.2f%n", hasil);
    }
    private static double akhir() {
        double hasil = tambah(array[0]); 
        hasil = kurang(array[1]); 
        hasil = kali(array[2]); 
        hasil = bagi(array[3]); 

        return hasil / 2; 
    }
    
    public static void main(String[] args) {
        double[] input = input(); 
        output(akhir()); 
    }
}