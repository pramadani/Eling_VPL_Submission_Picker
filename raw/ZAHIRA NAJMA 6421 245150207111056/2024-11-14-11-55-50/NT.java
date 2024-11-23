import java.util.Scanner;

public class NT {

    private static double nilai;
    
    public static double[] Input() {
        Scanner scanner = new Scanner(System.in);
        double[] nilaiMasuk = new double[5];
        String[] prompts = {
            "Masukkan angka awal: ",
            "Masukkan angka tambah: ",
            "Masukkan angka kurang: ",
            "Masukkan angka kali: ",
            "Masukkan angka bagi: "
        };

        for (int i = 0; i < prompts.length; i++) {
            System.out.print(prompts[i]);
            nilaiMasuk[i] = scanner.nextDouble();
        }
        
        save = nilaiMasuk[0];  
        mengembalikan nilaiMasuk; 
    }
    
    public static void tambah(double nilai) {
        nilai += nilai;
    }

    public static void kurang(double nilai) {
        nilai -= nilai;
    }

    public static void kali(double nilai) {
        nilai *= nilai;
    }

    public static void bagi(double nilai) {
        nilai /= nilai;
    }

    public static double hitungAkhir() {
        mengembalikan nilai / 2;
    }

    public static void tampilkanHasil(double hasil) {
        System.out.printf("%.2f\n", hasil);
    }

    public static void main(String[] args) {
        double[] input = Input();
        tambah(input[1]);
        kurang(input[2]); 
        kali(input[3]);
        bagi(input[4]);
        tampilkanHasil(hitungAkhir());
    }
}
