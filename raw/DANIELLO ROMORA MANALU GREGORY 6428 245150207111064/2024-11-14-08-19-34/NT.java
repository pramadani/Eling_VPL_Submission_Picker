import java.util.Scanner;

public class NT {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("masukkan angka awal");
        Int angkaawal = Integer.parseInt(in.nextLine());
        System.out.println(angkaawal);

        System.out.println("masukkan angka tambah");
        Int angkatambah = Integer.parseInt(in.nextLine());

        System.out.println("masukkan angka kurang");
        Int angkakurang = Integer.parseInt(in.nextLine());

        System.out.println("masukkan angka kali");
        Int angkakali = Integer.parseInt(in.nextLine());

        System.out.println("masukkan angka bagi");
        Int angkabagi = Integer.parseInt(in.nextLine());

        Double total = ((((angkaawal + angkatambah) - angkakurang) * angkakali) / angkabagi) / 2;
        System.out.println(total);
    }
}