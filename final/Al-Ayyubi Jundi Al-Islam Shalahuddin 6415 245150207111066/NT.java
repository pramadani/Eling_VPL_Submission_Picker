import java.util.Scanner;
public class NT {
    private static double angkaAwal;
    public static double[] input() {
        Scanner scanner = new Scanner(System.in);
        double[] input = new double[5];
        System.out.println("Masukkan angka awal: ");
        input[0] = scanner.nextDouble();
        System.out.println("Masukkan angka tambah: ");
        input[1] = scanner.nextDouble();
        System.out.println("Masukkan angka kurang: ");
        input[2] = scanner.nextDouble();
        System.out.println("Masukkan angka kali: ");
        input[3] = scanner.nextDouble();
        System.out.println("Masukkan angka bagi: ");
        input[4] = scanner.nextDouble();
        angkaAwal = input[0];
        return input;
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