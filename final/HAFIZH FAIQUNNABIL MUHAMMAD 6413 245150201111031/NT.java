import java.util.Scanner;

public class NT {
    static double awal;
    static double res;

    static double[] input() {
        Scanner in = new Scanner(System.in);
        double[] ipt = new double[5];
        ipt[0] = in.nextDouble();
        ipt[1] = in.nextDouble();
        ipt[2] = in.nextDouble();
        ipt[3] = in.nextDouble();
        ipt[4] = in.nextDouble();

        awal = ipt[0];
        res = awal;

        return ipt;
    }

    static double tambah(double n) {
        res += n;
        return res;
    }

    static double kurang(double n) {
        res -= n;
        return res;
    }

    static double kali(double n) {
        res *= n;
        return res;
    }

    static double bagi(double n) {
        res /= n;
        return res;
    }

    static void output(double n) {
        System.out.printf("%.2f", n);
    }

    static double akhir() {
        return res / 2;
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