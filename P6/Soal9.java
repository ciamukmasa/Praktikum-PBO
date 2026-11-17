package P6;

public class Soal9 {

    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 6};

        // Perulangan 1: for biasa
        System.out.println("Menggunakan for:");
        for (int i = 0; i < age.length; i++) {
            System.out.println("age[" + i + "] = " + age[i]);
        }

        // Perulangan 2: for-each
        System.out.println("Menggunakan for-each:");
        for (int nilai : age) {
            System.out.println(nilai);
        }
    }
}