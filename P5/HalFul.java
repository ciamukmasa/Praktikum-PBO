package P5;
import java.util.Scanner;

public class HalFul {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
    int baris = 5;
        System.out.printf("%-20s%s%n", "Half Triangle", "Full Triangle");
        for (int i = 1; i <= baris; i++) {
            String half = "*".repeat(2 * i - 1);
            int k = (i <= 3) ? 2 * i - 1 : 2 * (baris + 1 - i) - 1;
            String full = " ".repeat((baris - k) / 2) + "*".repeat(k);
            System.out.printf("%-20s%s%n", half, full);
        }
    }
    
}
