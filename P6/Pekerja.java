package P6;

public class Pekerja extends Thread {

    public Pekerja(String nama) {
        super(nama);
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(getName() + " : langkah " + i);
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " terinterupsi.");
        }
        System.out.println(getName() + " selesai.");
    }
}