package javaapplication3;

class Insan{
    int boy=150;
    double kilo=85;
    String ad="Bilinmiyor", soyad="Bilinmiyor";
    
    public Insan(){
        
    }
    
    public Insan(String adi,String soyadi,int boyu,int kilosu){
        boy=boyu;
        kilo=kilosu;
        ad=adi;
        soyad=soyadi;
    }
    void uyu(){
        System.out.println("zzz");
    }
    void yemekye(){
        System.out.println("gnom gnom");
    }
    void adinisoyle(){
        System.out.println(ad+" "+soyad);
    }
}

public class JavaApplication3 {
  public static void main(String[] args)
  {
      Insan ali=new Insan("Ali","Yildiz",170,85);
      
      ali.uyu();
      ali.yemekye();
      ali.adinisoyle();
      Insan mehmet=new Insan("Mehmet","Yilmaz",180,74);
      
      
      System.out.println(""+(mehmet.boy+10));
      
      Insan bilinmez=new Insan();
      System.out.println(""+bilinmez.ad+" "+bilinmez.soyad);
  }
}