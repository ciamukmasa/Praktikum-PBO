package P4;

import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukkan NIK: ");
        String nik = s.nextLine();
        
        System.out.print("Masukkan Nama: ");
        String nama = s.nextLine();
        
        System.out.print("Masukkan Kode Golongan (1-4): ");
        int kodegolongan = s.nextInt();
        
        System.out.print("Masukkan Jumlah Anak: ");
        int jumlahanak = s.nextInt();
        
        double gajipokok = 0;
        
        switch (kodegolongan) {
            case 1:
                gajipokok = 1200000; 
                break;
            case 2:
                gajipokok = 1500000;
                break;
            case 3:
                gajipokok = 1750000; 
                break;
            case 4:
                gajipokok = 2000000; 
                break;
            default:
                System.out.println("Kode golongan tidak valid.");
        }
        
        double tunjanganpasangan = 0.10 * gajipokok;
        double tunjangananak = 0.05 * gajipokok * jumlahanak;
        double totaltunjangan = tunjanganpasangan + tunjangananak;
        double gajibersih = gajipokok + totaltunjangan;
        
        System.out.println("~~ Rincian Gaji Karyawan ~~");
        System.out.println("NIK          : " + nik);
        System.out.println("Nama         : " + nama);
        System.out.println("Gaji Pokok   : Rp " + gajipokok);
        System.out.println("Tunjangan    : Rp " + totaltunjangan);
        System.out.println("Gaji Bersih  : Rp " + gajibersih);
        
    }
}
    

