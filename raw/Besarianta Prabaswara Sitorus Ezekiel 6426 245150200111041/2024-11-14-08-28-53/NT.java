import java.util.*;
public class NT {

    // [kode]>
    private static double [] input () {
        Scanner scanner = new Scanner(System.in);
        double [] in = new double[5];
        in [0] = scanner.nextDouble();
        in [1] = scanner.nextDouble();
        in [2] = scanner.nextDouble();
        in [3] = scanner.nextDouble();
        in [4] = scanner.nextDouble();
        return in;
        }

    private static double tambah (double angka) {
        double hasil =  + angka;
        return hasil;
    }

    private static double kurang (double angka) {
        double hasil = - angka;
        return hasil;
    }

    private static double kali (double angka) {
        double hasil = * angka;
        return hasil;
    }

    private static double bagi (double angka) {
        double hasil = / angka;
        return hasil;
    }

    private static double akhir () {
    

    // <[kode]
    
    public static void main(String[] args) {
        double[] input = input();
        System.out.println(input);
        tambah(input[1]);
        kurang(input[2]);
        kali(input[3]);
        bagi(input[4]);
        output(akhir());
    }
}
