package P7;

public class KelilingWMethod {
        
    double HitungKeliling(double panjang, double lebar){
        return 2 * (panjang + lebar); 
    }
    
    public static void main(String[] args) {
        KelilingWMethod PP = new KelilingWMethod();
        double P = 10.5;
        double L = 5.0;
        
        double keliling = PP.HitungKeliling(P,L);
        System.out.println("panjang : " + P);
        System.out.println("lebar : " + L);
        System.out.println("Keliling persegi panjang : " + keliling);
        
        
    }
}