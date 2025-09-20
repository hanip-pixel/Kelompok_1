public class MataKuliah {
    private String kode;
    private String nama;
    private int sks;
    private String dosenPengampu;

    public MataKuliah(String kode, String nama, int sks, String dosenPengampu) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.dosenPengampu = dosenPengampu;
    }

    public void tampilkanInfo() {
        System.out.println("=== INFORMASI MATA KULIAH ===");
        System.out.println("Kode Mata Kuliah : " + kode);
        System.out.println("Nama Mata Kuliah : " + nama);
        System.out.println("Jumlah SKS       : " + sks);
        System.out.println("Dosen Pengampu   : " + dosenPengampu);
        System.out.println("=============================");
    }

    public static void main(String[] args) {
        MataKuliah mk = new MataKuliah("B01", "PBO", 3, "ican");
        mk.tampilkanInfo();
    }
} 