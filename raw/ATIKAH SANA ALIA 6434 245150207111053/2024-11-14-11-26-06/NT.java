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
    static double hasil = 0;

    public static void tambah(double n){
        hasil+=n;
    }
    public static void kurang(double n){
        hasil-=n;
    }
    public static void kali(double n){
        hasil*=n;
    }
    public static void bagi(double n){
        hasil/=n;
    }
    public static double[] input(){
        Scanner s = new Scanner(System.in);
        double[] angka = new double[5];
        for(int i=0;i<5;i++){
            angka[i] = s.nextDouble();
        }
        hasil = angka[0];
        return angka;
    }
    public static double akhir(){
        return hasil/2;
    }
    public static void output(double n){
        System.out.println(n);
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