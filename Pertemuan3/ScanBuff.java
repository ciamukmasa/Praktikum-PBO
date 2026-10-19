package Pertemuan3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScanBuff {

    // Method menggunakan Scanner
    void bacaScanner() {
        Scanner inputScan = new Scanner(System.in);
        System.out.print("[Scanner] Masukkan angka: ");
        int angkaScan = inputScan.nextInt();
        System.out.println("Hasil dari class lain (Scanner): " + angkaScan);
    }

    // Method menggunakan BufferedReader
    void bacaBuffer() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("[BufferedReader] Masukkan angka: ");
        int angkaBuffer = Integer.parseInt(br.readLine());
        System.out.println("Hasil dari class lain (BufferedReader): " + angkaBuffer);
    }

    // Class Utama (Main)
    public static class Main {
        public static void main(String[] args) throws IOException {
            // Membuat objek dari class ScanBuff
            ScanBuff proses = new ScanBuff();

            System.out.println("=== DEMO DUA CLASS DALAM SATU PROGRAM ===");

            // Memanggil fungsi Scanner dari class lain
            proses.bacaScanner();

            System.out.println();

            // Memanggil fungsi BufferedReader dari class lain
            proses.bacaBuffer();
        }
    }
}