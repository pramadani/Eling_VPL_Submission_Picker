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

    public static int angkaTambah(int n, int r) {
        return (n + r);
    }

    public static int angkaKurang(int r, int x) {
        return (r - x);
    }

    public static int angkakali(int x, int y) {
        return (x * y);
    }

    public static int angkabagi(int y, int z) {
        return (y / z); 
    }

    public static double angkaakhir(int n, int r, int x, int y, int z) {
        return (n + r - x * y / z);
    }

    public static double[] input() {
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

    public static void output(double akhir) {
        System.out.printf("Angka akhir: %.2f\n", akhir);
    }

    public static void main(String[] args) {
        double[] input = input();

        int n = (int) input[0];
        int r = angkaTambah(n, (int) input[1]);
        int x = angkaKurang(r, (int) input[2]);
        int y = angkakali(x, (int) input[3]);
        int z = angkabagi(y, (int) input[4]);

        double akhir = angkaakhir(n, r, x, y, z);

    
        System.out.printf("Angka awal: %d\n", n);
        System.out.printf("Angka tambah: %d\n", r);
        System.out.printf("Angka kurang: %d\n", x);
        System.out.printf("Angka kali: %d\n", y);
        System.out.printf("Angka bagi: %d\n", z);
        
        output(akhir);
    }
}
