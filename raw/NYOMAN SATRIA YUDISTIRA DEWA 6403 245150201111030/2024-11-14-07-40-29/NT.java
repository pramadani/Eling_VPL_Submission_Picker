import java.util.Scanner;

public class NT {
    static double angkaAwal;
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
    public static void akhir() {
        System.out.print((angkaAwal)/2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        angkaAwal = scanner.nextDouble();
        double angkaTambah = scanner.nextDouble();
        double angkaKurang = scanner.nextDouble();
        double angkaKali = scanner.nextDouble();
        double angkaBagi = scanner.nextDouble();
        tambah(angkaTambah);
        kurang(angkaKurang);
        kali(angkaKali);
        bagi(angkaBagi);
        akhir();
        scanner.close();
    }
}