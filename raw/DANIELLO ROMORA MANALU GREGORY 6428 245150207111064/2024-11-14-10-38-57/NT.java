import java.util.*;

public class NT {
    private double value;

    public void input(double startValue) {
        this.value = startValue;
    }

    public void tambah(double num) {
        this.value += num;
    }

    public void kurang(double num) {
        this.value -= num;
    }

    public void kali(double num) {
        this.value *= num;
    }

    public void bagi(double num) {
        this.value /= num;
    }

    public double akhir() {
        this.value /= 2;
        return Math.round(this.value * 100.0) / 100.0;
    }

    public void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka awal: ");
        input(scanner.nextDouble());

        System.out.print("Masukkan angka untuk penjumlahan: ");
        tambah(scanner.nextDouble());

        System.out.print("Masukkan angka untuk pengurangan: ");
        kurang(scanner.nextDouble());

        System.out.print("Masukkan angka untuk perkalian: ");
        kali(scanner.nextDouble());

        System.out.print("Masukkan angka untuk pembagian: ");
        bagi(scanner.nextDouble());

        System.out.println("Hasil akhir: " + akhir());

        scanner.close();
    }

    public static void main(String[] args) {
        Main calc = new Main();
        calc.main();
    }
}