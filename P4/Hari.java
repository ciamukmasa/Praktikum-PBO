package P4;

import java.util.Scanner ;

public class Hari {
    public static void main(String[] args) {
           Scanner s = new Scanner(System.in);
           System.out.println("~~Pilihan Hari~~");
           System.out.println("1.Senin ");
           System.out.println("2.Selasa ");
           System.out.println("3.Rabu ");
           System.out.println("4.Kamis ");
           System.out.println("5.Jumat ");
           System.out.println("6.Sabtu ");
           System.out.println("7.Minggu ");
           
           System.out.print("Masukan Pilihan: ");
           int hari = s.nextInt();
           
           switch (hari) {
            case 1:
                System.out.println("Hari yang kamu pilih Senin");
                break;
            case 2:
                System.out.println("Hari yang kamu pilih Selasa");
                break;
            case 3:
                System.out.println("Hari yang kamu pilih Rabu");
                break;
            case 4:
                System.out.println("Hari yang kamu pilih Kamis");
                break;
            case 5:
                System.out.println("Hari yang kamu pilih Jumat");
                break;
            case 6:
                System.out.println("Hari yang kamu pilih Sabtu");
                break;
            case 7:
                System.out.println("Hari yang kamu pilih Minggu");
                break;
            default:
                System.out.println("Kode hari tidak valid! Masukkan angka antara 1 sampai 7.");
        }     
        
    }
    
}
