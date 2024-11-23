import java.util.Scanner;

public class NT {
    public static double hasil;

    public static double[] in() {
        Scanner in = new Scanner(System.in);
        double[] input = new double[5];
        
        for(int i = 0; i < input.length; i++){
            input[i] = in.nextDouble();
        }
        return input;
    }
    public static void tambah(double value){
        hasil += value;
    }
    public static void kurang(double value){
        hasil -= value;
    }
    public static void kali(double value){
        hasil *= value;
    }
    public static void bagi(double value){
        hasil /= value;
    }
    public static double akhir(){
        return hasil / 2;
    }
    public static void output(double finalResult){
        System.out.printf("%.2f", finalResult);
    }
    public static void main(String[] args) {
        double[] input = in();
        tambah(input[1]);
        kurang(input[2]);
        kali(input[3]);
        bagi(input[4]);
        output(akhir());
    }
}