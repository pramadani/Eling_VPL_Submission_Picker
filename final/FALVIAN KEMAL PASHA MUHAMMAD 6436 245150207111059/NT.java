import java.util.Scanner;

public class NT {

    public double input(double angkaAwal) {
        return angkaAwal;
    }

    public double tambah(double nilaiSementara, double angkaTambah) {
        return nilaiSementara + angkaTambah;
    }

    public double kurang(double nilaiSementara, double angkaKurang) {
        return nilaiSementara - angkaKurang;
    }

    public double kali(double nilaiSementara, double angkaKali) {
        return nilaiSementara * angkaKali;
    }

    public double bagi(double nilaiSementara, double angkaBagi) {
        return nilaiSementara / angkaBagi;
    }

    public double hasil(double nilaiSementara) {
        nilaiSementara /= 2;
        return ((int) (nilaiSementara * 100)) / 100.0;
    }

    public double main1(double angkaAwal, double angkaTambah, double angkaKurang, double angkaKali, double angkaBagi) {
        double nilaiSementara = input(angkaAwal);
        nilaiSementara = tambah(nilaiSementara, angkaTambah);
        nilaiSementara = kurang(nilaiSementara, angkaKurang);
        nilaiSementara = kali(nilaiSementara, angkaKali);
        nilaiSementara = bagi(nilaiSementara, angkaBagi);
        return hasil(nilaiSementara);
    }

    public static double[] ambilInput() {
        Scanner scanner = new Scanner(System.in); 
        double[] input = new double[5];
        System.out.print("Masukkan angka awal: ");
        input[0] = scanner.nextDouble();
        System.out.print("Masukkan angka tambah: ");
        input[1] = scanner.nextDouble();
        System.out.print("Masukkan angka kurang: ");
        input[2] = scanner.nextDouble();
        System.out.print("Masukkan angka kali: ");
        input[3] = scanner.nextDouble();
        System.out.print("Masukkan angka bagi: ");
        input[4] = scanner.nextDouble();
        return input;
    }

    public static void cetakOutput(double hasilAkhir) {
        System.out.println("Hasil akhir: " + hasilAkhir);
    }

    public static void main(String[] args) {
        NT calculator = new NT();
        double[] input = ambilInput();
        double hasilAkhir = calculator.main1(input[0], input[1], input[2], input[3], input[4]);
        cetakOutput(hasilAkhir);
    }
}
