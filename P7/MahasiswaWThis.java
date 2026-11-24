package P7;

public class MahasiswaWThis {
    String nama;
    String npm;
    String kelas;

    public MahasiswaWThis(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }

    void cetakData() {
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Nama  : " + this.nama);
        System.out.println("NPM   : " + this.npm);
        System.out.println("Kelas : " + this.kelas);
    }

    public static void main(String[] args) {
        MahasiswaWThis mhs = new MahasiswaWThis("Ciamukmasa", "5520125084", "IF-C-2025");
        mhs.cetakData();
    }
}