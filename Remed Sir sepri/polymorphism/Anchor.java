public class Anchor extends PemainFutsal {
    public Anchor(String nama, int nomorPunggung) {
        super(nama, nomorPunggung);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("ANCHOR");
        super.tampilkanInfo();
        System.out.println("Tugas: Mengatur pertahanan dan distribusi bola");
        System.out.println();
    }
}
