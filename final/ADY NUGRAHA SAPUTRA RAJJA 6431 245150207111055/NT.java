import java.util.Scanner;

public class method1 {
    public static double tambah (double x, double y){
        double hasil1 = x + y;
        return hasil1;
    }

public static double kurang (double hasil1, double z){
        double hasil2 = hasil1 - z;
        return hasil2;
}    

public static double kali ( double hasil2, double a){
    double hasil3 = hasil2 * a;
    return hasil3;
}

public static double bagi ( double hasil3, double b){
    double hasil4 = hasil3 % b;
    return hasil4;
}


      
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