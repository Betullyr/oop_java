package com.company;

public class Asistan extends Akademisyen{
    private String ofisSaati;

    Asistan(String adsoyad,String telefon,String eposta,String bolum,String ofisSaati){
        super(adsoyad, telefon, eposta, bolum);
        this.ofisSaati=ofisSaati;
        this.setUnvan("Asistan");
    }

  public String getOfisSaati(){
        return ofisSaati;
  }

  public void setOfisSaati(String ofisSaati){
        this.ofisSaati=ofisSaati;
  }

    @Override
    public void giris() {
        System.out.println(getAdsoyad()+" Asistani giris yapti");
    }
    public void cikis() {
        System.out.println(getAdsoyad()+" Asistani cikis yapti");
    }
}

