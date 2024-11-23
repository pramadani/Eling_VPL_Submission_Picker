import java.util.Scanner;

public class NT {
    static double angka = 0;
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        
        double[]input = input();
        
        angka = input[0];

        tambah(input[1]);
        kurang(input[2]);
        kali(input[3]);
        bagi(input[4]);
        output(akhir());

    }
    public static double input(){
        double[]input = new double[5];
        for(int i = 0; i<input.length; i++){
            input[i] = in.nextDouble();
        }
    }
    public static double tambah(double input1){
        return angka+=input1;
    }
    public static double kurang(double input2){
        return angka -=input2;
    }
    public static double kali(double input3){
        return angka *= input3;
    }
    public static double bagi(double input4){
        return angka /= input4;
    }
    public static double akhir(){
        return angka/2;
    }
    public static void output(double n){
        System.out.printf( "%.2f", n);
    }



}
