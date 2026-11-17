package P6;

import java.util.Arrays;
import java.util.Scanner;

public class Soal3 {

    static Scanner in = new Scanner(System.in);

    static int bacaInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(in.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa bilangan bulat!");
            }
        }
    }

    public static void main(String[] args) {
        // a. jumlah elemen
        int n = bacaInt("a. Masukkan jumlah elemen array: ");
        if (n <= 0) {
            System.out.println("Jumlah elemen harus lebih dari 0.");
            return;
        }
        int[] data = new int[n];

        // b. isi elemen
        System.out.println("b. Masukkan nilai elemen:");
        for (int i = 0; i < n; i++) {
            data[i] = bacaInt("   Elemen ke-" + i + " : ");
        }

        // c. terbesar & terkecil beserta indeksnya
        int maks = data[0], iMaks = 0, min = data[0], iMin = 0;
        for (int i = 1; i < n; i++) {
            if (data[i] > maks) { maks = data[i]; iMaks = i; }
            if (data[i] < min)  { min = data[i];  iMin = i; }
        }
        System.out.println("c. Terbesar = " + maks + " (indeks " + iMaks + ")");
        System.out.println("   Terkecil = " + min + " (indeks " + iMin + ")");

        // d. jumlah & rata-rata
        int total = 0;
        for (int x : data) total += x;
        double rata = (double) total / n;
        System.out.println("d. Jumlah semua = " + total + ", rata-rata = " + rata);

        // e. indeks genap (NPM genap), f. indeks ganjil (NPM ganjil)
        int jumlahGenap = 0;
        int jumlahGanjil = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) jumlahGenap += data[i];
            else jumlahGanjil += data[i];
        }
        System.out.println("e. Jumlah elemen berindeks genap  = " + jumlahGenap + "   (NPM genap)");
        System.out.println("f. Jumlah elemen berindeks ganjil = " + jumlahGanjil + "   (NPM ganjil)");

        // g. cek ganjil/genap hasil e dan f
        System.out.println("g. Hasil e (" + jumlahGenap + ") bernilai " + (jumlahGenap % 2 == 0 ? "genap" : "ganjil"));
        System.out.println("   Hasil f (" + jumlahGanjil + ") bernilai " + (jumlahGanjil % 2 == 0 ? "genap" : "ganjil"));

        // h. urutkan (ascending)
        int[] urut = data.clone();
        Arrays.sort(urut);
        System.out.println("h. Setelah diurutkan: " + Arrays.toString(urut));
    }
}