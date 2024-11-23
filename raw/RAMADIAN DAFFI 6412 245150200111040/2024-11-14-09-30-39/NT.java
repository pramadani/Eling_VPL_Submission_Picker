import java.util.Scanner;
public class NT {
    
    static double hasil;

    static double[] input(){
        Scanner in = new Scanner(System.in);
        double [] isi = {
            (in.nextDouble()),
            (in.nextDouble()),
            (in.nextDouble()),
            (in.nextDouble()),
            (in.nextDouble()),
        };
        hasil = isi[0];
        return isi;
    }

    static void tambah(double value){
        hasil += value;
    }

    static void kurang(double value){
        hasil -= value;
    }

    static void kali(double value){
        hasil *= value;
    }

    static void bagi(double value){
        if (value == 0){
            hasil = 0;
        } else {
            hasil /= value;
        }
    }

    static boolean akhir(){
        return true;
    }

    static void output(boolean benar){
        if (benar){
            System.out.println(hasil);
        }
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
