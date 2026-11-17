package P6;

public class Soal7 {

    public static void main(String[] args) {
        Thred t = new Thred("Thread-Anak");
        try {
            t.join(); // tunggu thread anak selesai
        } catch (InterruptedException e) {
            System.out.println("Thread utama terinterupsi.");
        }
        System.out.println("Thread utama selesai.");
    }
}
