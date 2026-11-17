package P6;

import java.util.Scanner;

public class Soal8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int jumlah = 0;
        while (jumlah <= 0) {
            System.out.print("Jumlah thread anak yang diinginkan: ");
            try {
                jumlah = Integer.parseInt(in.nextLine().trim());
                if (jumlah <= 0) System.out.println("Jumlah thread harus lebih dari 0.");
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa bilangan bulat!");
            }
        }

        System.out.println("Thread utama (" + Thread.currentThread().getName() + ") mulai.");
        Pekerja[] daftar = new Pekerja[jumlah];
        for (int i = 0; i < jumlah; i++) {
            daftar[i] = new Pekerja("Thread-Anak-" + (i + 1));
            daftar[i].start();
        }

        try {
            for (Pekerja p : daftar) p.join(); // thread utama menunggu semua anak
        } catch (InterruptedException e) {
            System.out.println("Thread utama terinterupsi.");
        }
        System.out.println("Semua thread anak selesai. Thread utama selesai.");
    }
}