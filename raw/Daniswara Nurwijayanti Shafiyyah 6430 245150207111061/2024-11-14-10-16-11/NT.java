/* 
 * 1. Harus menggunakan template yang disediakan.
 * 2. Wajib meletakkan kode logic yang sesuai dengan nama method.
 * 3. Wajib mengimplementasikan semua method.
 * 4. Satu method hanya boleh handle 1 tipe logic.
 * 5. Hanya boleh meletakkan kode pada kolom yang disediakan.
 * 6. Tidak diperbolehkan mengubah method main.
 */
import java.util.Scanner;
public class NT {

    public static double angkaTambah(double n, double r) {
        return n + r;
    }

    public static double angkaKurang(double r, double x) {
        return r - x;
    }

    public static double angkaKali(double x, double y) {
        return x * y;
    }

    public static double angkaBagi(double y, double z) {
        return y / z; 
    }

    public static double angkaAkhir(double n, double r, double x, double y, double z) {
       
        double hasilTambah = angkaTambah(n, r);
        double hasilKurang = angkaKurang(hasilTambah, x);
        double hasilKali = angkaKali(hasilKurang, y);
        double hasilbagi = angkaBagi(hasilKali, z);
        return hasilbagi / 2;
    }

    public static double[] input() {
        Scanner scanner = new Scanner(System.in);
        double[] input = new double[5];

        System.out.print("angka awal: ");
        input[0] = scanner.nextDouble();

        System.out.print("angka tambah: ");
        input[1] = scanner.nextDouble();

        System.out.print("angka kurang: ");
        input[2] = scanner.nextDouble();

        System.out.print("angka kali: ");
        input[3] = scanner.nextDouble();

        System.out.print("angka bagi: ");
        input[4] = scanner.nextDouble();

        return input;
    }

    public static void output(double akhir) {
        System.out.printf("Angka akhir: %.2f\n", akhir);
    }

    public static void main(String[] args) {
        double[] input = input();

        double n = input[0];
        double r = input[1];
        double x = input[2];
        double y = input[3];
        double z = input[4];

        double akhir = angkaAkhir(n, r, x, y, z);

        output(akhir);
    }
}