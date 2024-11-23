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
    public static double[] input = input();
    public static double[] input(){
        Scanner in = new Scanner(System.in);
        double[] data = new double[5];
        for (int i = 0; i < 5; i++) {
            data[i] = in.nextInt();
        }
        return data;
    }
    public static double tambah(double n){
        return input[0]+=n;
    }
    public static double kurang(double n){
        return input[0]-=n;
    }
    public static double kali(double n){
        return input[0]*=n;
    }
    public static double bagi(double n){
        return input[0]/=n;
    }
    public static double akhir(){
        return input[0]/=2;
    }
    public static void output(double input){
        System.out.println(input);
    }
    public static void main(String[] args) {
        tambah(input[1]);
        kurang(input[2]);
        kali(input[3]);
        bagi(input[4]);
        output(akhir());
    }
}