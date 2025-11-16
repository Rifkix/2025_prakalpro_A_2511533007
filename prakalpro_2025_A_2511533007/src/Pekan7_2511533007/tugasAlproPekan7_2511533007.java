package Pekan7_2511533007;

import java.util.Scanner;

public class tugasAlproPekan7_2511533007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Akun akun = new Akun();
        
        
        System.out.println("REGISTRASI AKUN BARU");
        
        System.out.print("Masukkan Username: ");
        String username = input.nextLine();
        
        System.out.print("Masukkan Password: ");
        String password = input.nextLine();
        
        System.out.print("Masukkan Email: ");
        String email = input.nextLine();
        
        System.out.print("Masukkan PIN (6 digit): ");
        int pin = input.nextInt();
        
        akun.setUsername(username);
        akun.setPassword(password);
        akun.setEmail(email);
        akun.setPinAngka(pin);
        
        if (!akun.isPasswordValid()) {
            System.out.println("\nREGISTRASI GAGAL");
            System.out.println("Password \"" + akun.getPassword() + "\" tidak valid (harus minimal 8 karakter).");
            System.out.println("Silakan coba lagi.");
        } else if (!akun.isEmailValid()) {
            System.out.println("\nREGISTRASI GAGAL");
            System.out.println("Email Anda \"" + akun.getEmail() + "\" tidak valid (harus mengandung '@' dan '.').");
            System.out.println("Silakan coba lagi.");
        } else {
            System.out.println("\n--- REGISTRASI BERHASIL ---");
            System.out.println("Akun untuk \"" + akun.getUsername() + "\" telah berhasil dibuat.");
            System.out.println("\nDetail Akun");
            System.out.println("Username (Lowercase): " + akun.getUsername().toLowerCase());
            System.out.println("Email (Uppercase)    : " + akun.getEmail().toUpperCase());
            System.out.println("ID Pengguna (Gabungan): " + akun.getUsername().concat(String.valueOf(akun.getPinAngka())));
            System.out.println("--");
            System.out.println("Uji Tipe Data (PIN Anda: " + akun.getPinAngka() + ")");
            System.out.println("PIN (int) + 10       = " + (akun.getPinAngka() + 10));
            System.out.println("PIN (String) + \"10\" = " + String.valueOf(akun.getPinAngka()) + "10");
        }
        
        input.close();
    }
}