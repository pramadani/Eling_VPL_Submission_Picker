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
    private double angkaAwal;

    public static void main(String[] args) {
        NT main = new NT();
        main.input();
        main.tambah();
        main.kurang();
        main.kali();
        main.bagi();
        main.akhir();
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        angkaAwal = scanner.nextDouble();
    }

    public void tambah() {
        Scanner scanner = new Scanner(System.in);
        double angkaTambah = scanner.nextDouble();
        angkaAwal += angkaTambah;
    }

    public void kurang() {
        Scanner scanner = new Scanner(System.in);
        double angkaKurang = scanner.nextDouble();
        angkaAwal -= angkaKurang;
    }

    public void kali() {
        Scanner scanner = new Scanner(System.in);
        double angkaKali = scanner.nextDouble();
        angkaAwal *= angkaKali;
    }

    public void bagi() {
        Scanner scanner = new Scanner(System.in);
        double angkaBagi = scanner.nextDouble();
        angkaAwal /= angkaBagi;
    }

    public void akhir() {
        angkaAwal /= 2;
        System.out.printf("%.2f", angkaAwal);
    }
}

