/* 
 * 1. Harus menggunakan template yang disediakan.
 * 2. Wajib meletakkan kode logic yang sesuai dengan nama method.
 * 3. Wajib mengimplementasikan semua method.
 * 4. Satu method hanya boleh handle 1 tipe logic.
 * 5. Hanya boleh meletakkan kode pada kolom yang disediakan.
 * 6. Tidak diperbolehkan mengubah method main.
 */

public class NT {
    private double angkaAwal;

    public void input(double angkaAwal, double angkaTambah, double angkaKurang, double angkaKali, double angkaBagi) {
        this.angkaAwal = angkaAwal;
        this.angkaTambah = angkaTambah;
        this.angkaKurang = angkaKurang;
        this.angkaKali = angkaKali;
        this.angkaBagi = angkaBagi;
    }

    private void tambah() {
        angkaAwal += angkaTambah;
    }

    private void kurang() {
        angkaAwal -= angkaKurang;
    }

    private void kali() {
        angkaAwal *= angkaKali;
    }

    private void bagi() {
        angkaAwal /= angkaBagi;
    }

    private double akhir() {
        angkaAwal /= 2;
        return Math.round(angkaAwal * 100.0) / 100.0;
    }

    public double main(double angkaAwal, double angkaTambah, double angkaKurang, double angkaKali, double angkaBagi) {
        input(angkaAwal, angkaTambah, angkaKurang, angkaKali, angkaBagi);
        tambah();
        kurang();
        kali();
        bagi();
        return akhir();
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.main(7, 1, 2, 3, 4);
        System.out.println(result);  // Output: 2.25
    }
}


