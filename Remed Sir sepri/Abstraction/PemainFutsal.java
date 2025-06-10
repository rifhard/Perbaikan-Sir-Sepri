public abstract class PemainFutsal {
    protected String nama;
    protected int nomorPunggung;

    public PemainFutsal(String nama, int nomorPunggung) {
        this.nama = nama;
        this.nomorPunggung = nomorPunggung;
    }

    public void tampilkanIdentitas() {
        System.out.println("Nama: " + nama);
        System.out.println("Nomor Punggung: " + nomorPunggung);
    }

   
    public abstract void tugasPosisi();
}
