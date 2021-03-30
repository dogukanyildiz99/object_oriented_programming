package javaapplication2;

/**
 *
 * @author doguk
 */
public class Musteri {
    public String adi;
    public String soyadi;
    public int yasi;
    public String cinsiyet;
    
public void sil(){
    this.adi="";
    this.soyadi="";
    this.cinsiyet="";
    this.yasi=0;
    System.out.println("Musteri silindi.");
}

public void ekle(){
    System.out.println("Musteri eklendi.");
}

public void guncelle(){
    System.out.println("Musteri guncellendi.");
}

public void bilgileriGetir(){
    System.out.println("Adi : "+this.adi);
    System.out.println("Soyadi : "+this.soyadi);
    System.out.println("Yasi : "+this.yasi);
    System.out.println("Cinsiyet : "+this.cinsiyet);
}

}
