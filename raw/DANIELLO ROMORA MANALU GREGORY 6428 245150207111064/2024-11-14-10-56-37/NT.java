import java.util.Scanner;

public class NT {
    private double value;

    public void setInitialValue(double startValue) {
        value = startValue;
    }
    
    public void add(double num) {
        value += num;
    }
    
    public void subtract(double num) {
        value -= num;
    }
    
    public void multiply(double num) {
        value *= num;
    }
    
    public void divide(double num) {
        value /= num;
    }
    
    public double total() {
        value /= 2;
        return Math.round(value * 100.0) / 100.0; 
    }
    
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka awal: ");
        setInitialValue(scanner.nextDouble());

        System.out.print("Masukkan angka tambah: ");
        add(scanner.nextDouble());

        System.out.print("Masukkan angka kurang: ");
        subtract(scanner.nextDouble());

        System.out.print("Masukkan angka kali: ");
        multiply(scanner.nextDouble());

        System.out.print("Masukkan angka bagi: ");
        divide(scanner.nextDouble());

        System.out.println("Hasil akhir: " + total());
    }

    public static void main(String[] args) {
        NT NT = new NT();
        NT.execute();
    }
}