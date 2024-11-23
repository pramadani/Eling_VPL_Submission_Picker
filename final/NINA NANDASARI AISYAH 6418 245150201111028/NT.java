import java.util.Scanner;

public class NT {
    static double angkaAwal;

    public static double[] input() {
        Scanner scanner = new Scanner(System.in);
        double[] inputValues = new double[5];
        
        try {
            for (int i = 0; i < 5; i++) {
                inputValues[i] = scanner.nextDouble();
            }
            angkaAwal = inputValues[0];  
        } catch (Exception e) {
            System.out.println("Program Error: Input harus berupa angka desimal atau bilangan bulat.");
            System.exit(1); 
        } finally {
        }
        
        return inputValues;
    }
    public static void tambah(double angkaTambah) {
        angkaAwal += angkaTambah;
    }
    public static void kurang(double angkaKurang) {
        angkaAwal -= angkaKurang;
    }
    public static void kali(double angkaKali) {
        angkaAwal *= angkaKali;
    }
    public static void bagi(double angkaBagi) {
        angkaAwal /= angkaBagi;
    }
    public static double akhir() {
        return angkaAwal / 2;
    }
    public static void output(double hasilAkhir) {
        System.out.printf("%.2f\n", hasilAkhir);
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