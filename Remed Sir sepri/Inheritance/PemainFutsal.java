public class PemainFutsal {
    protected String nama;
    protected int nomorPunggung;

    public PemainFutsal(String nama, int nomorPunggung) {
        this.nama = nama;
        this.nomorPunggung = nomorPunggung;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Nomor Punggung: " + nomorPunggung);
    }
}
