import java.util.Scanner;

public class NT {
    public static void main(String[] args) {
        double[] input = input();
        tambah(input[1]);
        kurang(input[2]);
        kali(input[3]);
        bagi(input[4]);
        output(akhir());
    }

    static double[] input() {
        Scanner in = new Scanner(System.in);
        double[] ipt =  new double[5];

        ipt[0] = in.nextInt();

        return ipt;
    }

    static void tambah(double n) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
    }

    static void kurang(double n) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
    }

    static void kali(double n) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
    }

    static void bagi(double n) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
    }

    static void output(double[] arr) {
        double result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }

        System.out.println(akhir(result));
    }

    static double akhir(double n) {
        return n / 2;
    }
}
