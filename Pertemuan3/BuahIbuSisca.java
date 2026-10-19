package Pertemuan3;

import java.io.*;

public class BuahIbuSisca {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan jumlah mangga awal (pcs): ");
        int manggaAwal = Integer.parseInt(br.readLine());

        System.out.print("Masukkan jumlah mangga busuk (pcs): ");
        int manggaBusuk = Integer.parseInt(br.readLine());

        System.out.print("Masukkan jumlah tetangga yang diberi jambu: ");
        int jumlahTetangga = Integer.parseInt(br.readLine());

        System.out.print("Masukkan jumlah jambu per tetangga (pcs): ");
        int jambuPerTetangga = Integer.parseInt(br.readLine());

        int manggaBagus = manggaAwal - manggaBusuk;
        int totalJambu = jumlahTetangga * jambuPerTetangga;
        int totalBuah = manggaBagus + totalJambu;

        System.out.println("\n===== RINCIAN BUAH IBU SISCA =====");
        System.out.println("Mangga yang bagus : " + manggaBagus + " pcs");
        System.out.println("Total Jambu       : " + totalJambu + " pcs");
        System.out.println("Total Buah Dibeli : " + totalBuah + " pcs");
    }
}
    
