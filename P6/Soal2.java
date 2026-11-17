
package P6;

public class Soal2 {

    public static void main(String[] args) {
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};

        int indeks = -1;
        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i].equals("Suzuki")) {
                indeks = i;
                break;
            }
        }

        if (indeks == -1) {
            System.out.println("Suzuki tidak ditemukan.");
            return;
        }

        System.out.println("Array awal  : " + mobil);
        System.out.println("Indeks \"Suzuki\" = " + indeks);

        mobil[indeks] = "Toyota"; // ubah nilai pada indeks tersebut

        System.out.println("Setelah diubah, mobil[" + indeks + "] = " + mobil);
        System.out.println("Array akhir : " + mobil);
    }
}

    

