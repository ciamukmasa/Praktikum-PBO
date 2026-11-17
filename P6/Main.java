package P6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih = -1;

        do {
            System.out.println("\n===== PRAKTIKUM ARRAY, EXCEPTION, MULTITHREADING =====");
            System.out.println("1. Tiga variasi sintaks array integer");
            System.out.println("2. Array String mobil (cari & ubah Suzuki)");
            System.out.println("3. Array satu dimensi (max, min, jumlah, rata-rata, dst)");
            System.out.println("4. Daftar nilai mahasiswa");
            System.out.println("5. Penjumlahan matriks");
            System.out.println("6. Rata-rata bilangan + penanganan kesalahan");
            System.out.println("7. Thread dengan extends Thread");
            System.out.println("8. Banyak thread (utama + thread anak)");
            System.out.println("9. Dua macam perulangan array age");
            System.out.println("10. Menampung data berbeda tipe");
            System.out.println("0. Keluar");
            System.out.print("Pilih soal: ");

            try {
                pilih = Integer.parseInt(in.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka 0-10!");
                pilih = -1;
                continue;
            }
            System.out.println();

            switch (pilih) {
                case 1:  Soal1.main(args);  break;
                case 2:  Soal2.main(args);  break;
                case 3:  Soal3.main(args);  break;
                case 4:  Soal4.main(args);  break;
                case 5:  Soal5.main(args);  break;
                case 6:  Soal6.main(args);  break;
                case 7:  Soal7.main(args);  break;
                case 8:  Soal8.main(args);  break;
                case 9:  Soal9.main(args);  break;
                case 10: Soal10.main(args); break;
                case 0:  System.out.println("Selesai."); break;
                default: System.out.println("Pilihan tidak tersedia.");
            }
        } while (pilih != 0);
    }
}