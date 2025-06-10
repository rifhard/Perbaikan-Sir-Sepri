public class MainFutsal {
    public static void main(String[] args) {
        Kiper kiper = new Kiper("Jason", 5);
        PemainLapangan pemain1 = new PemainLapangan("Dimas", 10, 3);
        PemainLapangan pemain2 = new PemainLapangan("Fikri", 7, 6);

        kiper.tampilkanInfo();
        pemain1.tampilkanInfo();
        pemain2.tampilkanInfo();
    }
}
