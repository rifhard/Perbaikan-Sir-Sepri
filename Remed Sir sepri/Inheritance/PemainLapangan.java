public class PemainLapangan extends PemainFutsal {
    private int jumlahGol;

    public PemainLapangan(String nama, int nomorPunggung, int jumlahGol) {
        super(nama, nomorPunggung);
        this.jumlahGol = jumlahGol;
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Posisi: Pemain Lapangan");
        System.out.println("Jumlah Gol: " + jumlahGol);
        System.out.println();
    }
}
