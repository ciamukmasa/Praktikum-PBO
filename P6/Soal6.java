package P6;

import java.util.Scanner;

public class Soal6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 0;
        while (n <= 0) {
            System.out.print("Banyaknya bilangan: ");
            try {
                n = Integer.parseInt(in.nextLine().trim());
                if (n <= 0) System.out.println("Banyaknya bilangan harus lebih dari 0.");
            } catch (NumberFormatException e) {
                System.out.println("Error: input bukan bilangan bulat! Silakan ulangi.");
            }
        }

        double[] angka = new double[n];
        int i = 0;
        while (i < n) {
            System.out.print("Bilangan ke-" + (i + 1) + " : ");
            try {
                angka[i] = Double.parseDouble(in.nextLine().trim());
                i++; // maju hanya jika input valid
            } catch (NumberFormatException e) {
                // penanganan kesalahan: user memasukkan bukan bilangan
                System.out.println("Error: input bukan bilangan! Silakan ulangi.");
            }
        }

        double total = 0;
        for (double x : angka) total += x;
        System.out.println("Rata-rata = " + (total / n));
    }
}