package P7;

public class Rekursif {
    void HitungMundur(int n){
        if(n == 0){
            System.out.println("SELESAI!");
        }else{
            System.out.println("angka :" + n);
            HitungMundur (n - 1);
        }
    }
    public static void main(String[] args) {
        Rekursif R = new Rekursif();
        R.HitungMundur(10);
    }
}
