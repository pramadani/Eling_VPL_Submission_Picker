import java.util.Scanner;

public class NT {
    Scanner in = new Scanner(System.in);
    int awal = in.nextInt();
    int tambah = in.nextInt();
    int kurang = in.nextInt();
    int kali = in.nextInt();
    int bagi = in.nextInt();
    
    private  class tambah{
        
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