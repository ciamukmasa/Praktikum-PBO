package P5;
import java.util.Scanner;

public class No7 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
    int i = 0;
        System.out.println("Menggunakan i++ (nilai dipakai dulu, baru ditambah):");
        while (i < 3) {
            System.out.println("  i++ -> " + (i++));
        }
        int j = 0;
        System.out.println("Menggunakan ++j (ditambah dulu, baru nilai dipakai):");
        while (j < 3) {
            System.out.println("  ++j -> " + (++j));
        }
    }
    
}
