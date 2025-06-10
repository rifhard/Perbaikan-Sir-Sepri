public class Pivot extends PemainFutsal {
    public Pivot(String nama, int nomorPunggung) {
        super(nama, nomorPunggung);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("PIVOT");
        super.tampilkanInfo();
        System.out.println("Tugas: Penyerang utama");
        System.out.println();
    }
}
