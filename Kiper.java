public class Kiper extends PemainFutsal {
    private int jumlahSaves;

    public Kiper(String nama, int nomorPunggung, int jumlahSaves) {
        super(nama, nomorPunggung);
        this.jumlahSaves = jumlahSaves;
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Posisi: Kiper");
        System.out.println("Jumlah Saves: " + jumlahSaves);
        System.out.println();
    }
}
