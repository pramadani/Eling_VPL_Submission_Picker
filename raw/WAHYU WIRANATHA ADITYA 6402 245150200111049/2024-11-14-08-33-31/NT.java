import java.util.Scanner;

public class NT {
    private static double angkaAwal;

    public static void main(String[] args) {
        double[] input = input();
        angkaAwal = input[0];
        tambah(input[1]);
        kurang(input[2]);
        kali(input[3]);
        bagi(input[4]);
        output(akhir());
    }

    public static double[] input() {
        Scanner scanner = new Scanner(System.in);
        double[] inputs = new double[5];
        
        for (int i = 0; i < 5; i++) {
            inputs[i] = scanner.nextDouble();
        }
        
        scanner.close();
        return inputs;
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
}
