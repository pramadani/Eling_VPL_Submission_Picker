import java.util.Scanner;

public class NT {
    private static double angAwal;

    public static double[] input() {
        Scanner scanner = new Scanner(System.in);
        double[] inputs = new double[5];

        for (int i = 0; i < 5; i++) {
            inputs[i] = scanner.nextDouble();
        }

        scanner.close();
        return inputs;
    }

    public static void tambah(double angkaTam) {
        angAwal += angkaTam;
    }

    public static void kurang(double angkaKur) {
        angAwal -= angkaKur;
    }

    public static void kali(double angkaKali) {
        angAwal *= angkaKali;
    }

    public static void bagi(double angkaBag) {
        angAwal /= angkaBag;
    }

    public static double akhir() {
        return angAwal / 2;
    }

    public static void output(double hasilAkhir) {
        System.out.printf("%.2f\n", hasilAkhir);
    }

    public static void main(String[] args) {
        double[] input = input();
        angAwal = input[0];
        tambah(input[1]);
        kurang(input[2]);
        kali(input[3]);
        bagi(input[4]);
        output(akhir());
    }
}
