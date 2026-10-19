package Pertemuan3;
import java.util.Scanner;

public class GayaSentripetal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Massa (M): ");
        double m = input.nextDouble();

        System.out.print("Masukkan Kecepatan (V): ");
        double v = input.nextDouble();

        System.out.print("Masukkan Jari-jari (r): ");
        double r = input.nextDouble();

        double fc = (m *v*v) / r;

        System.out.println("\nBesar Gaya Sentripetal (Fc) = " + fc);
    }
}
    

