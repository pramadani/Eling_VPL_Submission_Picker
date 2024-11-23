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
    public class Calculator {
    private double angkaAwal;
    private double angkaAkhir;
    private double angkaTambah;
    private double angkaKurang;
    private double angkaKali;
    private double angkaBagi;

    // Method untuk menerima input awal dan parameter operasi
    public void input(double angkaAwal, double angkaTambah, double angkaKurang, double angkaKali, double angkaBagi) {
        this.angkaAwal = angkaAwal;
        this.angkaTambah = angkaTambah;
        this.angkaKurang = angkaKurang;
        this.angkaKali = angkaKali;
        this.angkaBagi = angkaBagi;
    }

    // Method operasi tambah
    public void tambah() {
        angkaAwal += angkaTambah;
    }

    // Method operasi kurang
    public void kurang() {
        angkaAwal -= angkaKurang;
    }

    // Method operasi kali
    public void kali() {
        angkaAwal *= angkaKali;
    }

    // Method operasi bagi
    public void bagi() {
        angkaAwal /= angkaBagi;
    }

    // Method bagi dua
    public void bagiDua() {
        angkaAkhir = angkaAwal / 2;
    }

    // Method utama yang menjalankan semua operasi
    public void main() {
        tambah();
        kurang();
        kali();
        bagi();
        bagiDua();
        // Menampilkan hasil akhir dengan dua angka di belakang koma
        System.out.printf("%.2f%n", angkaAkhir);
    }

    // Program utama untuk pengujian
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.input(7, 1, 2, 3, 4);  // Sample Input
        calc.main();  // Output: 2.25
    }
}


    
}


