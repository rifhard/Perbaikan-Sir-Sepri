package encapsulation;
public class PemainFutsal {
    private String nama;
    private String posisi;
    private int nomorPunggung;
    private int umur;

    public PemainFutsal(String nama, String posisi, int nomorPunggung, int umur) {
        this.nama = nama;
        this.posisi = posisi;
        this.nomorPunggung = nomorPunggung;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public int getNomorPunggung() {
        return nomorPunggung;
    }

    public void setNomorPunggung(int nomorPunggung) {
        this.nomorPunggung = nomorPunggung;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Posisi: " + posisi);
        System.out.println("Nomor Punggung: " + nomorPunggung);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println();
    }
}
