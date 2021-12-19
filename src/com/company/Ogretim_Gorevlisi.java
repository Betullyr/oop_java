package com.company;

public class Ogretim_Gorevlisi extends Akademisyen{
     private int kapino;

    Ogretim_Gorevlisi(String adsoyad,String telefon,String eposta,String bolum,int kapino){
        super(adsoyad,telefon,eposta,bolum);
        this.kapino=kapino;
        this.setUnvan("Ogretim Gorevlisi");
    }

    public void sinavYap(){
        System.out.println("Sinav yapıldı");
    }

    @Override
    public void giris() {
        System.out.println(getAdsoyad()+" akademisyeni giris yapti");
    }
    public void cikis() {
        System.out.println(getAdsoyad()+" akademisyeni cikis yapti");
    }
}
