

import java.util.Scanner;

public class NT {
    static double angkaawal;

    public static void main(String[] args) {
        double[] masuk = input();
        angkaawal = masuk[0];
        tambah(masuk[1]);
        kurang(masuk[2]);
        kali(masuk[3]);
        bagi(masuk[4]);
        output(akhir());
    }

    public static double[] input() {
        Scanner in = new Scanner(System.in);
        double[] masukan = new double[5];
        for (int i = 0; i < 5; i++) {
            masukan[i] = in.nextDouble();
        }
        in.close();
        return masukan;
    }

    public static void tambah(double angkabuattambah) {
        angkaawal = angkaawal + angkabuattambah;
    }

    public static void kurang(double angkabuatkurang) {
        angkaawal = angkaawal - angkabuatkurang;
    }

    public static void kali(double angkakli) {
        angkaawal = angkaawal * angkakli;
    }

    public static void bagi(double angkabgi) {
        angkaawal = angkaawal / angkabgi;
    }

    public static double akhir() {
        return angkaawal / 2;
    }

    public static void output(double hasilbagi2) {
        System.out.printf("%.2f", hasilbagi2);
    }

}
