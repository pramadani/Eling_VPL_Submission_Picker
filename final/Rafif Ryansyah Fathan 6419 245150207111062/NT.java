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
    private static double angkaAwal;
    private static double hasil;

    public static double[] input() {
        Scanner scanner = new Scanner(System.in);
        double[] input = new double[5];
        for (int i = 0; i < 5; i++) {
            input[i] = scanner.nextDouble();
        }
        scanner.close();
        angkaAwal = input[0];
        hasil = angkaAwal;
        return input;
    }

    public static void tambah(double angkaTambah) {
        hasil += angkaTambah;
    }

    public static void kurang(double angkaKurang) {
        hasil -= angkaKurang;
    }

    public static void kali(double angkaKali) {
        hasil *= angkaKali;
    }

    public static void bagi(double angkaBagi) {
        hasil /= angkaBagi;
    }

    public static double akhir() {
        return hasil / 2;
    }

    public static void output(double angkaAkhir) {
        System.out.printf("%.2f", angkaAkhir);
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
