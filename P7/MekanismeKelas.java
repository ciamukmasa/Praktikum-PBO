package P7;

public class MekanismeKelas {
    
static class Mhs{
    String nama;
    int npm;

    void identitasMhs(){
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("npm : " + npm);
    }    
}
    public static void main(String[] args) {
        Mhs c = new Mhs();
        c.nama = "Cia imup";
        c.npm = 552198263;
        
        c.identitasMhs();
    }
}