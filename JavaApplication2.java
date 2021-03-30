package javaapplication2;

/**
 *
 * @author doguk
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Musteri musteri1 = new Musteri();
        musteri1.adi="Dogukan";
        musteri1.soyadi="YILDIZ";
        musteri1.cinsiyet="erkek";
        musteri1.yasi=22;
        
        musteri1.bilgileriGetir();
        musteri1.sil();
        musteri1.bilgileriGetir();
    }
    
}
