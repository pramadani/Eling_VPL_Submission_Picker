import java.util.Scanner;

public class NT {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("masukkan angka awal");
        String angkaawal = in.nextLine();
        System.out.println(angkaawal);

        System.out.println("masukkan angka tambah");
        String angkatambah = in.nextLine();

        System.out.println("masukkan angka kurang");
        String angkakurang = in.nextLine();

        System.out.println("masukkan angka kali");
        String angkakali = in.nextLine();

        System.out.println("masukkan angka bagi");
        String angkabagi = in.nextLine();

        String total = ((((angkaawal + angkatambah) - angkakurang) * angkakali) / angkabagi) / 2;
        System.out.println(total);
    }
}