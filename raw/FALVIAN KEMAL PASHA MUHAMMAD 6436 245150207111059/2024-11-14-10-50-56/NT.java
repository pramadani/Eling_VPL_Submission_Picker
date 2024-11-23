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
     public double  input(double angkaawal){
        return angkaawal;      
    }
    public double tambah(double nilaisementara,double angkatambah){
        return nilaisementara + angkatambah;
    }
    public double kurang(double nilaisementara,double angkakurang){
        return nilaisementara - angkakurang;
    }
    public double kali(double nilaisementara,double angkakali){
        return nilaisementara * angkakali;
    }
    public double bagi(double nilaisementara,double angkabagi){
        return nilaisementara / angkabagi;
    }
    public double hasil(double nilaisementara){
        nilaisementara /=2;
        return ((int)(nilaisementara * 100)) / 100;
    }

    public double main(double angkaawal,double angkatambah,double angkakurang,double angkakali,double angkabagi){
        double nilaisementara = input(angkaawal);
        nilaisementara = tambah(nilaisementara, angkatambah);
        nilaisementara = kurang(nilaisementara, angkakurang);
        nilaisementara = kali(nilaisementara, angkakali);
        nilaisementara = bagi(nilaisementara, angkabagi);
        return hasil(nilaisementara);  
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