package P6;

import java.util.Scanner;

public class Soal5 {

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

    static void tampilMatriks(String judul, int[][] m) {
        System.out.println("\n" + judul + ":");
        for (int[] baris : m) {
            for (int x : baris) System.out.printf("%6d", x);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int baris = bacaInt("Jumlah baris  : ");
        int kolom = bacaInt("Jumlah kolom  : ");
        if (baris <= 0 || kolom <= 0) {
            System.out.println("Baris dan kolom harus lebih dari 0.");
            return;
        }

        int[][] A = new int[baris][kolom];
        int[][] B = new int[baris][kolom];
        int[][] C = new int[baris][kolom];

        System.out.println("Masukkan elemen matriks A:");
        for (int i = 0; i < baris; i++)
            for (int j = 0; j < kolom; j++)
                A[i][j] = bacaInt("  A[" + i + "][" + j + "] = ");

        System.out.println("Masukkan elemen matriks B:");
        for (int i = 0; i < baris; i++)
            for (int j = 0; j < kolom; j++)
                B[i][j] = bacaInt("  B[" + i + "][" + j + "] = ");

        for (int i = 0; i < baris; i++)
            for (int j = 0; j < kolom; j++)
                C[i][j] = A[i][j] + B[i][j];

        tampilMatriks("Matriks A", A);
        tampilMatriks("Matriks B", B);
        tampilMatriks("Hasil A + B", C);
    }
}