public class Kiper extends PemainFutsal {
    public Kiper(String nama, int nomorPunggung) {
        super(nama, nomorPunggung);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("KIPER");
        super.tampilkanInfo();
        System.out.println("Tugas: Menjaga gawang");
        System.out.println();
    }
}
