import java.util.Scanner;
public class NT {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("masukkan angka awal: ");
        int angkaawal = Integer.parseInt(in.nextLine());

        System.out.println("masukkan angka tambah: ");
        int angkatambah = Integer.parseInt(in.nextLine());

        System.out.println("masukkan angka kurang: ");
        int angkakurang = Integer.parseInt(in.nextLine());

        System.out.println("masukkan angka kali: ");
        int angkakali = Integer.parseInt(in.nextLine());

        System.out.println("masukkan angka bagi: ");
        int angkabagi = Integer.parseInt(in.nextLine());

        double total = ((((angkaawal+angkatambah)-angkakurang)*angkakali)/angkabagi)/2;
        System.out.println(total);
    }
}