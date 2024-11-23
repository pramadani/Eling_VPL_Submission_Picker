import java.util.Scanner;

public class NT {
    private static double angkaAwal;
    private static double angkaAkhir;
    public static void main(String[] args) {
        double[] input = input();
        tambah(input[1]);
        kurang(input[2]);
        kali(input[3]);
        bagi(input[4]);
        output(akhir());
    }

    public static double[] input() {
        Scanner scanner = new Scanner(System.in);
        double[] inputValues = new double[5];
        for (int i = 0; i < 5; i++) {
            inputValues[i] = scanner.nextDouble();
        }
        angkaAwal = inputValues[0];
        angkaAkhir = angkaAwal;
        scanner.close();
        return inputValues;
    }
    
    public static void kurang(double angkaKurang) {
        angkaAkhir -= angkaKurang;
    }

    public static void tambah(double angkaTambah) {
        angkaAkhir += angkaTambah;
    }
    
    public static void bagi(double angkaBagi) {
        angkaAkhir /= angkaBagi;
    }

    public static void kali(double angkaKali) {
        angkaAkhir *= angkaKali;
    }

    
    public static double akhir() {
        return angkaAkhir / 2;
    }

    public static void output(double hasil) {
        System.out.printf("%.2f%n", hasil);
    }
}