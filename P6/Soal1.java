package P6;

import java.util.Arrays;

public class Soal1 {

    public static void main(String[] args) {
        // Variasi 1: deklarasi + inisialisasi langsung
        int[] a = {10, 20, 30};

        // Variasi 2: new + ukuran, lalu isi per indeks
        int[] b = new int[3];
        b[0] = 1;
        b[1] = 2;
        b[2] = 3;

        // Variasi 3: new int[] { ... } dan kurung siku setelah nama variabel
        int c[] = new int[]{7, 8, 9};

        System.out.println("Variasi 1 : " + Arrays.toString(a));
        System.out.println("Variasi 2 : " + Arrays.toString(b));
        System.out.println("Variasi 3 : " + Arrays.toString(c));
    }
}