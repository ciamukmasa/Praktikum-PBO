package P5;
import java.util.Scanner;

public class JumBil {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Banyak bilangan : ");
        int n = in.nextInt();
        int total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Bilangan ke-" + i + " : ");
            total += in.nextInt();
        }
        double rata = (double) total / n;
        System.out.println("Total jumlah : " + total);
        System.out.println("Rata-rata    : " + rata);
    }    
}
    

