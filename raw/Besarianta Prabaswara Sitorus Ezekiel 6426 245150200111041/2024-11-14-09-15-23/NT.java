import java.util.*;
public class lc51 {

    // [kode]>
    static double awal;

    private static double [] input () {
        Scanner scanner = new Scanner(System.in);
        double [] in = new double[5];
        in [0] = scanner.nextDouble();
        in [1] = scanner.nextDouble();
        in [2] = scanner.nextDouble();
        in [3] = scanner.nextDouble();
        in [4] = scanner.nextDouble();
        awal = in [0];
        return in;
        }

    private static double tambah (double angka1) {
        awal += angka1;
        return awal;
    }

    private static double kurang (double angka2) {
        awal -= angka2;
        return awal;
    }

    private static double kali (double angka3) {
        awal *= angka3;
        return awal;
    }

    private static double bagi (double angka4) {
        awal /= angka4;
        return awal;
    }

    private static double akhir () {
        awal /= 2;
        return awal;
    }

    private static void output (double akh) {
        System.out.printf("%.2f\n", akh);
    }
    

    // <[kode]
    
    public static void main(String[] args) {
        double[] input = input();
        tambah(input[1]);
        kurang(input[2]);
        kali(input[3]);
        bagi(input[4]);
        output(akhir());
    }
}
