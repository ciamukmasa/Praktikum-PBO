package P5;
import java.util.Scanner;

public class GanjilArr {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
     System.out.print("Masukkan banyak angka : ");
        int n = in.nextInt();
        int ganjil = 1, total = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(ganjil + " ");
            total += ganjil;
            ganjil += 2;
        }
        System.out.println();
        System.out.println("Total penjumlahan : " + total);
    }
    
}
