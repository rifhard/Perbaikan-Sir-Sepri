package encapsulation;
public class MainFutsal {
    public static void main(String[] args) {
    
        PemainFutsal pemain1 = new PemainFutsal("Jason", "Kiper", 1, 15);
        PemainFutsal pemain2 = new PemainFutsal("Rifhrd", "Pivot", 10, 16);

       
        pemain1.tampilkanInfo();
        pemain2.tampilkanInfo();

        
        pemain2.setPosisi("Anchor");
        pemain2.setNomorPunggung(7);

      
        System.out.println("Setelah update posisi:");
        pemain2.tampilkanInfo();
    }
}
