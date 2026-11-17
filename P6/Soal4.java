package P6;

import java.util.Scanner;

public class Soal4 {

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
        int n = bacaInt("Jumlah mahasiswa: ");
        if (n <= 0) {
            System.out.println("Jumlah mahasiswa harus lebih dari 0.");
            return;
        }
        String[] nama = new String[n];
        int[] nilai = new int[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nama mahasiswa ke-" + (i + 1) + " : ");
            nama[i] = in.nextLine();
            nilai[i] = bacaInt("Nilai                : ");
            // kurang dari sama dengan 50 -> Tidak Lulus, lebih dari 50 -> Lulus
            status[i] = (nilai[i] <= 50) ? "Tidak Lulus" : "Lulus";
        }

        System.out.println("\n          Daftar Nilai Mahasiswa");
        System.out.println("---------------------------------------------");
        System.out.printf("%-4s %-20s %-7s %-12s%n", "No", "Nama", "Nilai", "Status");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-4d %-20s %-7d %-12s%n", (i + 1), nama[i], nilai[i], status[i]);
        }
        System.out.println("---------------------------------------------");
    }
}