package Pekan3;

import java.util.Scanner;

public class VolumeBola {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari bola: ");
        double r = input.nextDouble();

        double pi = 3.14;
        double volume = (4.0 / 3.0) * pi * r * r * r;

        System.out.println("Volume bola = " + volume);

        input.close();
    }
}
