package P4;
import java.util.Scanner;

public class Salesman {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukkan total penjualan barang hari ini: ");
        double penjualan = s.nextDouble();
        
        double uangjasa = 0;
        double komisi = 0;
        
        if (penjualan <= 2000000) {
            uangjasa = 100000;
            komisi = 0.10 * penjualan;
        } else if (penjualan <= 5000000) {
            uangjasa = 200000;
            komisi = 0.15 * penjualan;
        } else {
            uangjasa = 300000;
            komisi = 0.20 * penjualan;
        }
        
        double totalpendapatan = uangjasa + komisi;
        
        System.out.println("\n--- Rincian Pendapatan Salesman ---");
        System.out.println("Total Penjualan  : Rp " + penjualan);
        System.out.println("Uang Jasa        : Rp " + uangjasa);
        System.out.println("Uang Komisi      : Rp " + komisi);
        System.out.println("Total Pendapatan : Rp " + totalpendapatan);
        
    }
}
    

