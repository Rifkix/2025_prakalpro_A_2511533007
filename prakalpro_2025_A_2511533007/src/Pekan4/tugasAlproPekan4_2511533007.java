package Pekan4;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class tugasAlproPekan4_2511533007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        final double HARGA_DASAR = 1000.0;

        System.out.println("===== PEMBELIAN TIKET BIOSKOP =====");
        System.out.print("Nama Pembeli : ");
        String nama = sc.nextLine();

        int jumlah = 0;
        while (true) {
            System.out.print("Jumlah Tiket (angka > 0) : ");
            String line = sc.nextLine();
            try {
                jumlah = Integer.parseInt(line.trim());
                if (jumlah <= 0) {
                    System.out.println("Jumlah harus > 0");
                    continue;
                }
                break;
            } catch (NumberFormatException a) {
                System.out.println("Input tidak valid, masukkan angka bulat.");
            }
        }

        int kodeHari = 0;
        while (true) {
            System.out.println("Pilih Hari: 1=Senin-Kamis, 2=Jumat, 3=Sabtu-Minggu");
            System.out.print("Kode Hari (1-3): ");
            String s = sc.nextLine();
            try {
                kodeHari = Integer.parseInt(s.trim());
                if (kodeHari < 1 || kodeHari > 3) {
                    System.out.println("Pilihan hari harus 1-3. Coba lagi.");
                    continue;
                }
                break;
            } catch (NumberFormatException a) {
                System.out.println("Input tidak valid. Masukkan angka 1-3.");
            }
        }

        int kodeWaktu = 0;
        while (true) {
            System.out.println("Pilih Waktu: 1=Pagi 10:00-12:00, 2=Siang 12:00-17:00, 3=Malam 17:00-22:00");
            System.out.print("Kode Waktu (1-3): ");
            String s = sc.nextLine();
            try {
                kodeWaktu = Integer.parseInt(s.trim());
                if (kodeWaktu < 1 || kodeWaktu > 3) {
                    System.out.println("Pilihan waktu harus 1-3. Coba lagi.");
                    continue;
                }
                break;
            } catch (NumberFormatException a) {
                System.out.println("Input tidak valid. Masukkan angka 1-3.");
            }
        }

        int kodeStudio = 0;
        while (true) {
            System.out.println("Pilih Jenis Studio: 1=Regular, 2=Deluxe, 3=Premium");
            System.out.print("Kode Studio (1-3): ");
            String s = sc.nextLine();
            try {
                kodeStudio = Integer.parseInt(s.trim());
                if (kodeStudio < 1 || kodeStudio > 3) {
                    System.out.println("Pilihan studio harus 1-3. Coba lagi.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Masukkan angka 1-3.");
            }
        }

        String teksHari = (kodeHari == 1) ? "Senin-Kamis" : (kodeHari == 2) ? "Jumat" : "Sabtu-Minggu";
        String teksWaktu = (kodeWaktu == 1) ? "Pagi" : (kodeWaktu == 2) ? "Siang" : "Malam";
        String teksStudio = (kodeStudio == 1) ? "Regular" : (kodeStudio == 2) ? "Deluxe" : "Premium";

        double Hari = 0.0;
        if (kodeHari == 2) Hari = 0.10;
        if (kodeHari == 3) Hari = 0.30;

        double Waktu = 0.0;
        if (kodeWaktu == 1) Waktu = -0.10; 
        if (kodeWaktu == 3) Waktu = 0.20;

        double Studio = 0.0;
        if (kodeStudio == 2) Studio = 0.20;
        if (kodeStudio == 3) Studio = 10.00;

        double hargaPerTiketDouble = HARGA_DASAR * (1 + Hari + Waktu + Studio);
        long hargaPerTiket = Math.round(hargaPerTiketDouble);

        long subtotal = hargaPerTiket * (long) jumlah;

        double diskon = (jumlah >= 5) ? 0.20 : 0.0;
        long nominalDiskon = Math.round(subtotal * diskon);

        long totalBayar = subtotal - nominalDiskon;

        System.out.println();
        System.out.println("===== PEMBELIAN TIKET BIOSKOP =====");
        System.out.println("Nama Pembeli : " + nama);
        System.out.println("Jumlah Tiket : " + jumlah);
        System.out.println("Hari : " + teksHari);
        System.out.println("Waktu Tayang : " + teksWaktu);
        System.out.println("Jenis Studio : " + teksStudio);
        System.out.println("------------------------------------");
        System.out.println("Harga Dasar : " + nf.format((long) HARGA_DASAR) + "/tiket");
        System.out.printf("Biaya Hari : %s%%\n", (int) Math.round(Hari * 100));
        System.out.printf("Biaya Waktu : %s%%\n", (int) Math.round(Waktu * 100));
        System.out.printf("Biaya Studio : %s%%\n", (int) Math.round(Studio * 100));
        System.out.println("Harga per Tiket : " + nf.format(hargaPerTiket));
        System.out.println("Subtotal : " + nf.format(subtotal));
        System.out.printf("Diskon (%.0f%%) : %s\n", diskon * 100, nf.format(nominalDiskon));
        System.out.println("------------------------------------");
        System.out.println("TOTAL BAYAR : " + nf.format(totalBayar));

        sc.close();
    }
}
