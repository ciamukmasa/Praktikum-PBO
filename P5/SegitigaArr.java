package P5;
import java.util.Scanner;

public class SegitigaArr {
     static Scanner in = new Scanner(System.in);
     public static void main(String[] args) {
        
    
     System.out.print("Masukkan banyak baris : ");
        int baris = in.nextInt();
        int angka = 1;
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(angka++ + " ");
            }
            System.out.println();
        }
    }
    
}
