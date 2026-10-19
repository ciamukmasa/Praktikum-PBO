package Pertemuan3;
import java.io.*;

public class Perbelanjaan {

    public static void main(String[] args) {
        DataInputStream dis = new DataInputStream(System.in);

        try {
            System.out.print("Masukkan Nama : ");
            String nama = dis.readLine(); // Metode alternatif membaca string

            System.out.print("Masukkan Total Belanja : ");
            double totalBelanja = Double.parseDouble(dis.readLine());

            System.out.print("Masukkan Diskon (%) : ");
            double diskonPersen = Double.parseDouble(dis.readLine());

            System.out.print("Masukkan Uang Bayar : ");
            double bayar = Double.parseDouble(dis.readLine());

            // Perhitungan
            double nilaiDiskon = (diskonPersen / 100) * totalBelanja;
            double totalSetalahDiskon = totalBelanja - nilaiDiskon;
            double kembalian = bayar - totalSetalahDiskon;

            // Output
            System.out.println("\n===== NOTA PEMBELANJAAN =====");
            System.out.println("Nama          : " + nama);
            System.out.println("Total Belanja : Rp " + totalBelanja);
            System.out.println("Diskon (" + diskonPersen + "%) : Rp " + nilaiDiskon);
            System.out.println("Total         : Rp " + totalSetalahDiskon);
            System.out.println("Bayar         : Rp " + bayar);
            System.out.println("Kembalian     : Rp " + kembalian);

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan input/output: " + e.getMessage());
        }
    }
}
    
