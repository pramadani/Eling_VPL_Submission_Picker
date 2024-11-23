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

    // [kode]>

    // <[kode]
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Kalkulator kalkulator = new Kalkulator();
        private double hasil;
    private double angkaAwal;

        // Input angka awal dan parameter operasi
        double angkaAwal = scanner.nextDouble();
        double angkaTambah = scanner.nextDouble();
        double angkaKurang = scanner.nextDouble();
        double angkaKali = scanner.nextDouble();
        double angkaBagi = scanner.nextDouble();

        // Menjalankan operasi pada Kalkulator
        kalkulator.inputAngkaAwal(angkaAwal);
        kalkulator.tambah(angkaTambah);
        kalkulator.kurang(angkaKurang);
        kalkulator.kali(angkaKali);
        kalkulator.bagi(angkaBagi);

        // Output hasil akhir
        System.out.println(kalkulator.akhir());

 
        scanner.close();
        {
        

    public void inputAngkaAwal(double angka) {
        // Logika untuk menerima input angka awal
        this.angkaAwal = angka;
        this.hasil = angka;
    }

    public void tambah(double angka) {
        // Logika untuk operasi penjumlahan
        this.hasil += angka;
    }

    public void kurang(double angka) {
        // Logika untuk operasi pengurangan
        this.hasil -= angka;
    }

    public void kali(double angka) {
        // Logika untuk operasi perkalian
        this.hasil *= angka;
    }

    public void bagi(double angka) {
        // Logika untuk operasi pembagian
        this.hasil /= angka;
    }

    public String akhir() {
        // Logika untuk membagi hasil akhir dengan 2 dan mengembalikan output dengan 2 angka di belakang koma
        this.hasil /= 2;
        return String.format("%.2f", this.hasil);
    }
}

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         Kalkulator kalkulator = new Kalkulator();

//         // Input angka awal dan parameter operasi
//         double angkaAwal = scanner.nextDouble();
//         double angkaTambah = scanner.nextDouble();
//         double angkaKurang = scanner.nextDouble();
//         double angkaKali = scanner.nextDouble();
//         double angkaBagi = scanner.nextDouble();

//         // Menjalankan operasi pada Kalkulator
//         kalkulator.inputAngkaAwal(angkaAwal);
//         kalkulator.tambah(angkaTambah);
//         kalkulator.kurang(angkaKurang);
//         kalkulator.kali(angkaKali);
//         kalkulator.bagi(angkaBagi);

//         // Output hasil akhir
//         System.out.println(kalkulator.akhir());

//         scanner.close();
    }
}

        
        
    }
}