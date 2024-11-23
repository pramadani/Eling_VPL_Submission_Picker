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
    public static int angkakali (int x, int y) {
        return (x*y);
    }
    public static int angkabagi (int y, int z) {
        return (y%z);
    }
    public static int angkaakhir (int n, int r, int x, int y, int z){
        return (n + r-(x)*(y)%(z));
    }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n ;
            int r = n+r;
            int x = r+x;
            int y = x*y;
            int z = y%z;
            int akhir; 
            
        System.out.println("angka awal: ");
        System.out.println("angka tambah: " + r);
        System.out.println("Angka Kurang: " + x);
        System.out.println("Angka Kali: " + y);
        System.out.println("Angka Bagi: " + z);
        System.out.println("angka akhir: " + akhir );

    }
}

