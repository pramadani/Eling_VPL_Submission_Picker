import java.util.Scanner;

public class NT {

    private static double hasil;

    public static double[] input() {
        Scanner in = new Scanner(System.in);
        double[] input = new double[5];
        for (int i = 0; i < 5; i++) {
            input[i] = in.nextDouble();
        }
        hasilakhir = input[0];
        return input;
    }

    public static void tambah(double angkaTambah) {
        hasilakhir += angkaTambah;
    }

    public static void kurang(double angkaKurang) {
        hasilakhir -= angkaKurang;
    }

    public static void kali(double angkaKali) {
        hasilakhir *= angkaKali;
    }

    public static void bagi(double angkaBagi) {
        hasilakhir /= angkaBagi;
    }

    public static double akhir() {
        return hasilakhir / 2;
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
