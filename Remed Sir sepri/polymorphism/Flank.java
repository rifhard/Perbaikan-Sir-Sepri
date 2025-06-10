public class Flank extends PemainFutsal {
    public Flank(String nama, int nomorPunggung) {
        super(nama, nomorPunggung);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("FLANK");
        super.tampilkanInfo();
        System.out.println("Tugas: Menyerang dari sisi sayap");
        System.out.println();
    }
}
