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

    public static double[] input(){
        Scanner userInput = new Scanner(System.in);

        double[] arr = new double[5];

        for (int i = 0; i < 5; i++){
            arr[i] = userInput.nextDouble();
        }
        return arr;
    }

    public static double tambah(double input){
        NT obj = new NT();
        double[] tamb = obj.input();

        double tamba = tamb[0] + tamb[1];

        return tamba;
    }

    public static double kurang(double input){
        NT obj = new NT();
        double[] kurn = obj.input();

        double kura = tambah(1) - kurn[1];

        return kura;
    }

    public static double kali(double input){
        NT obj = new NT();
        double[] kalii = obj.input();

        double kkal = kurang(1) * kalii[1];

        return kkal;
    }

    public static double bagi(double input){
        NT obj = new NT();
        double[] bbagi = obj.input();

        double bag = kali(1) / bbagi[1];

        return bag;
    }

    public static double akhir(){
        NT obj = new NT();
        double[] akhirr = obj.input();

        double akhr = bagi(1);

        return akhr;
    }

    public static String output(double input){
        double a = akhir();
        String b = Double.toString(a);
        System.out.println(Double.toString(a));
        return b;
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