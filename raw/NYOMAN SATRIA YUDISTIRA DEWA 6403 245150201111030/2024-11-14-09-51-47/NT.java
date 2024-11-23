import java.util.Scanner;

public class NT {
    static double angkaAwal;

    public static double[] input() {
        Scanner scanner = new Scanner(System.in);
        double[] data = new double[5];
        data[0] = scanner.nextDouble();
        data[1] = scanner.nextDouble();
        data[2] = scanner.nextDouble();
        data[3] = scanner.nextDouble();
        data[4] = scanner.nextDouble();
        angkaAwal = data[0];
        scanner.close();
        return data;
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
        return (angkaAwal) / 2;
    }
    public static void output(double hasil) {
        System.out.print(hasil);
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
