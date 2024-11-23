/* 
 * 1. Harus menggunakan template yang disediakan.
 * 2. Wajib meletakkan kode logic yang sesuai dengan nama method.
 * 3. Wajib mengimplementasikan semua method.
 * 4. Satu method hanya boleh handle 1 tipe logic.
 * 5. Hanya boleh meletakkan kode pada kolom yang disediakan.
 * 6. Tidak diperbolehkan mengubah method main.
 */

static int tambah(double input){
		Scanner in=new Scanner(System.in);
		int awal=in.nextInt();
		int tambah=in.nextInt();
		int e1=awal+tambah;
		return e1;		
	}
	
	public static void main(String[] args) {
        double[] input = input();
        tambah(input[1]);
        kurang(input[2]);
        kali(input[3]);
        bagi(input[4]);
        output(akhir());
    }

	private static double[] input() {
		Scanner in=new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
	            input()[i] = in.nextDouble();
	        }
	        
	        return input();
	    }

	private static void output(Object akhir) {
         System.out.println(akhir());		
	}

	private static Object akhir() {
		int akhir=0;
		akhir=bagi(akhir)/2;
		return null;
	}

	private static int bagi(double d) {
		Scanner in=new Scanner (System.in);
		int bagi=in.nextInt();
		int e4=kali(d)/bagi;
		return e4;
		
	}

	private static int kali(double d) {
        Scanner in=new Scanner(System.in);
        int kali=in.nextInt();
        int e3=kurang(d)*kali;
		return e3;
        }

	private static int kurang(double d) {
		Scanner in=new Scanner(System.in);
		int kurang=in.nextInt();
		int e2=(tambah(d)-kurang);
		return e2;
		
	}
}