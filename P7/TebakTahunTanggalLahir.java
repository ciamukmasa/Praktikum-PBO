package P7;

public class TebakTahunTanggalLahir {
    void Hitungtrik (int bulan, int tanggal){
        int hasil = (bulan * 100) + tanggal;
        
        System.out.println("bulan : " + bulan +"tanggal : " + tanggal);
        System.out.println("hasil akhir angka : " + hasil);
    }
    public static void main(String[] args) {
        TebakTahunTanggalLahir t = new TebakTahunTanggalLahir();
        t.Hitungtrik(1,14);
        
    }
}
