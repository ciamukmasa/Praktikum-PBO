package P7;

class Civitas{
    String nama;
    String status;
    
    void tampil(){
        System.out.println("Nama : " + nama);
        System.out.println("Status : " + status);
    }
}

class Dosen extends Civitas{
    String nidm;
}

class Mahasiswa extends Civitas{
    String npm;
}

class Staff extends Civitas{
    String bagian;
}

public class CivitasAkademika {
    public static void main(String[] args) {
        Dosen d = new Dosen();
        d.nama = "Dr. Budi Santoso, M.T.";
        d.status = "Dosen Fakultas Teknik";
        d.nidm = "0412088501";
        
        Mahasiswa m = new Mahasiswa();
        m.nama = "Andi Pratama";
        m.status = "Mahasiswa Fakultas Teknik";
        m.npm = "221063117001";
        
        Staff s = new Staff();
        s.nama = "Rina Marlina, S.Kom.";
        s.status = "Staff Tata Usaha Fakultas Teknik";
        s.bagian = "Administrasi Akademik";
        
        System.out.println("=== DATA CIVITAS AKADEMIKA ===");
        d.tampil();
        System.out.println("NIDN   : " + d.nidm);
        
        System.out.println("------------------------------");
        m.tampil();
        System.out.println("NPM    : " + m.npm);
        
        System.out.println("------------------------------");
        s.tampil();
        System.out.println("Bagian : " + s.bagian);
    }
}
