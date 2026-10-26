package P4;

import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Masukan Angka: ");
        int angka = s.nextInt();
      
        
        if (angka % 2 == 0) {
            System.out.println("Bilangan " + angka + " adalah bilangan genap.");
        } else {
            System.out.println("Bilangan " + angka + " adalah bilangan ganjil.");
        }
        
        s.close();
    }
}