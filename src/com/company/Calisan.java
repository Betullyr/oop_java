package com.company;

public abstract class Calisan {
    private String adsoyad;
    private String telefon;
    private String eposta;

    Calisan(String adsoyad,String telefon,String eposta){
        this.adsoyad=adsoyad;
        this.telefon=telefon;
        this.eposta=eposta;
    }

    public String getAdsoyad(){
        return adsoyad;
    }
    public void setAdsoyad(String adsoyad){
        this.adsoyad=adsoyad;
    }

    public String getEposta(){
        return eposta;
    }
    public void setEposta(String eposta){
        this.eposta=eposta;
    }
    public String setTelefon(){
        return telefon;
    }
    public void setTelefon(String Telefon){
        this.telefon=telefon;
    }

    public abstract void giris();

    public abstract void cikis();

    public void yemekhane(){
        System.out.println("yemekhaneye gidildi");
    }
}
