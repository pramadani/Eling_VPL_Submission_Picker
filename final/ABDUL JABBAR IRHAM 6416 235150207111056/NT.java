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
    static double[] data;
    static double[] input(){
        Scanner in = new Scanner(System.in);
        data = new double[5];
        for (int i = 0; i < 5; i++) {
            data[i] = in.nextInt();
        }
        return data;
    }
    static double tambah(double n){
        return data[0]+=n;
    }
    static double kurang(double n){
        return data[0]-=n;
    }
    static double kali(double n){
        return data[0]*=n;
    }
    static double bagi(double n){
        return data[0]/=n;
    }
    static double akhir(){
        return data[0]/=2;
    }
    static void output(double input){
        System.out.println(input);
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