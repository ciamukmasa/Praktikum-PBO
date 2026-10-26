package P4;
import java.util.Scanner;

public class TahunKabisat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukkan tahun: ");
        int tahun = s.nextInt();
        
        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
            System.out.println("Tahun " + tahun + " adalah tahun kabisat.");
        } else {
            System.out.println("Tahun " + tahun + " bukan tahun kabisat.");
        }
    }
}


