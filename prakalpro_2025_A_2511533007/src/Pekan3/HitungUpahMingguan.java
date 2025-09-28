package Pekan3;

import java.util.Scanner;

public class HitungUpahMingguan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama karyawan: ");
        String nama = input.nextLine();

        System.out.print("Masukkan golongan (A/B/C/D): ");
        String golongan = input.nextLine();

        System.out.print("Masukkan jumlah jam kerja: ");
        int jumlahJam = input.nextInt();
        long tarifPerJam = 0;
        if (golongan.equals("A")) {
            tarifPerJam = 1000;
        } else if (golongan.equals("B")) {
            tarifPerJam = 2000;
        } else if (golongan.equals("C")) {
            tarifPerJam = 3000;
        } else if (golongan.equals("D")) {
            tarifPerJam = 4000;
        }

        long upahDasar = tarifPerJam * jumlahJam;

        int jamLembur = 0;
        long upahLembur = 0;
        if (jumlahJam > 60) {
            jamLembur = jumlahJam - 60;
            upahLembur = jamLembur * 5000L;
        }

        long upahTotal = upahDasar + upahLembur;

        System.out.println();
        System.out.println("=== Hasil Perhitungan Upah Mingguan ===");
        System.out.println("Nama karyawan : " + nama);
        System.out.println("Golongan      : " + golongan);
        System.out.println("Jam kerja     : " + jumlahJam);
        System.out.println("Upah dasar    : Rp " + upahDasar);
        System.out.println("Jam lembur    : " + jamLembur);
        System.out.println("Upah lembur   : Rp " + upahLembur);
        System.out.println("-------------------------------");
        System.out.println("Upah mingguan : Rp " + upahTotal);

        input.close();
    }
}
