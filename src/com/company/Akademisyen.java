package com.company;
public class Akademisyen extends Calisan{
    private String bolum;
    private String unvan;

    public Akademisyen(String adsoyad, String telefon, String eposta,String bolum, String unvan) {
        super(adsoyad, telefon, eposta);
        this.bolum=bolum;
        this.unvan=unvan;
    }
    public Akademisyen(String adsoyad, String telefon, String eposta,String bolum) {
        super(adsoyad, telefon, eposta);
        this.bolum=bolum;
    }

    public String getBolum(){
        return bolum;
  }
 public void setBolum(String bolum){
        this.bolum=bolum;
 }
  public String getUnvan(){
        return unvan;
  }
 public void setUnvan(String unvan){
        this.unvan=unvan;
 }
 public void dersegir(Akademisyen obj){
        System.out.println(obj.getAdsoyad()+"Derse girdi");
 }
 @Override
 public void giris(){
       System.out.println(getAdsoyad()+" Akademisyeni giris yapti");
 }
    @Override
    public void cikis(){
        System.out.println(getAdsoyad()+" Akademisyeni cikis yapti");
    }
}
