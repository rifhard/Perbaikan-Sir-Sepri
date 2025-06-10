public class MainFutsal {
    public static void main(String[] args) {
        PemainFutsal pemain1 = new Kiper("Jason", 1);
        PemainFutsal pemain2 = new Anchor("Hapis", 4);
        PemainFutsal pemain3 = new Pivot("Albert", 9);
        PemainFutsal pemain4 = new Flank("Rifhard", 7);

        PemainFutsal[] tim = {pemain1, pemain2, pemain3, pemain4};

        for (PemainFutsal pemain : tim) {
            pemain.tampilkanInfo();
        }
    }
}
