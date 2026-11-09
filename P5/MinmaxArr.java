package P5;
import java.util.Scanner;
public class MinmaxArr {
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        int max = 0, min = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Bilangan ke-" + (i + 1) + " : ");
            int n = in.nextInt();
            if (i == 0) {
                max = n;
                min = n;
            } else {
                if (n > max) max = n;
                if (n < min) min = n;
            }
        }
        System.out.println("Bilangan terbesar : " + max);
        System.out.println("Bilangan terkecil : " + min);
    }
    
}
