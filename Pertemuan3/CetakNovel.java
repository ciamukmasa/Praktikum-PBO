package Pertemuan3;
import java.util.Scanner;

public class CetakNovel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total lembar novel yang akan dicetak: ");
        long totalLembar = input.nextLong(); // Kecepatan 1 lembar/detik, maka total detik = total lembar

        long totalDetik = totalLembar;

        long hari = totalDetik / 86400; // 1 hari = 86400 detik
        long sisaHari = totalDetik % 86400;

        long jam = sisaHari / 3600;
        long sisaJam = sisaHari % 3600;

        long menit = sisaJam / 60;
        long detik = sisaJam % 60;

        System.out.println("\nWaktu Penyelesaian Cetak Novel:");
        System.out.println(hari + " hari, " + jam + " jam, " + menit + " menit, " + detik + " detik.");
    }
}
    
