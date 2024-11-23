/* 
 * 1. Harus menggunakan template yang disediakan.
 * 2. Wajib meletakkan kode logic yang sesuai dengan nama method.
 * 3. Wajib mengimplementasikan semua method.
 * 4. Satu method hanya boleh handle 1 tipe logic.
 * 5. Hanya boleh meletakkan kode pada kolom yang disediakan.
 * 6. Tidak diperbolehkan mengubah method main.
 */

public class NT {

    
    public static int angkaTambah(int n, int r) {
        return (n + r);
    }
    
    public static int angkaKurang(int r, int x) {
        return (r - x);
    }
    
    public static int angkakali(int x, int y) {
        return (x * y);
    }
    
    public static int angkabagi(int y, int z) {
        return (y / z); // Menggunakan pembagian biasa, bukan modulus
    }
    
    public static double angkaakhir(int n, int r, int x, int y, int z) {
        return (n + r - x * y / z);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan angka awal: ");
        int n = scanner.nextInt();
        
        System.out.print("Masukkan angka tambah: ");
        int r = scanner.nextInt();
        
        System.out.print("Masukkan angka kurang: ");
        int x = scanner.nextInt();
        
        System.out.print("Masukkan angka kali: ");
        int y = scanner.nextInt();
        
        System.out.print("Masukkan angka bagi: ");
        int z = scanner.nextInt();
        
        // Melakukan operasi secara berurutan
        r = angkaTambah(n, r);
        x = angkaKurang(r, x);
        y = angkakali(x, y);
        z = angkabagi(y, z);
        
        double akhir = angkaakhir(n, r, x, y, z);
        
        // Menampilkan hasil
        System.out.printf("Angka awal: %d\n", n);
        System.out.printf("Angka tambah: %d\n", r);
        System.out.printf("Angka kurang: %d\n", x);
        System.out.printf("Angka kali: %d\n", y);
        System.out.printf("Angka bagi: %d\n", z);
        System.out.printf("Angka akhir: %.2f\n", akhir);
        
        scanner.close();
    }
}



