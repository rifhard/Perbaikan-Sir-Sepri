public class Kiper extends PemainFutsal {

    public Kiper(String nama, int nomorPunggung) {
        super(nama, nomorPunggung);
    }

    @Override
    public void tugasPosisi() {
        System.out.println("Posisi: Kiper");
        System.out.println("Tugas: Menjaga gawang dari kebobolan.\n");
    }
}
