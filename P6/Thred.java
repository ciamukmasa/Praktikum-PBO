package P6;

// Kelas mewarisi Thread; run() adalah titik entri thread baru;
// kelas memanggil start() sendiri di konstruktor.
public class Thred extends Thread {

    public Thred(String nama) {
        super(nama);
        System.out.println("Thread dibuat: " + getName());
        start(); // memulai eksekusi thread -> memanggil run()
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + " : hitungan ke-" + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " terinterupsi.");
        }
        System.out.println(getName() + " selesai.");
    }
}
