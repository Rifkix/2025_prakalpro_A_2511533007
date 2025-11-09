package Pekan6_2511533007;

import java.util.Scanner;
import java.util.Random;

public class TugasPekan6_2511533007 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random dadu = new Random();
		boolean ulang = true;
		String jawab;
		
		while (ulang) {
			int percobaan = 0;
			int jml = 0;
			while (jml != 7) {
				int dadu1 = dadu.nextInt(6) + 1;
				int dadu2 = dadu.nextInt(6) + 1;
				jml = dadu1 + dadu2;
				percobaan++;
				System.out.println(dadu1 + " + " + dadu2 + " = " + jml);
			}
			System.out.println("Anda mendapatkan angka dadu berjumlah 7 setelah " + percobaan + " percobaan");
			System.out.println("Apakah anda masih ingin melempar dadu? (Yes/No)");
			jawab = scanner.next();
			if (jawab.equalsIgnoreCase("no") || jawab.equalsIgnoreCase("n")) {
				ulang = false;
			}
		
		}
		System.out.println("Program selesai");
		scanner.close();
	}

}
