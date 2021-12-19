package com.company;

public class Memur extends Calisan {
    private String mesai;
    private String departman;

    Memur(String adsoyad, String telefon, String eposta, String mesai, String departman) {
        super(adsoyad, telefon, eposta);
        this.mesai = mesai;
        this.departman = departman;
    }

    public String getMesai() {
        return mesai;
    }

    public void setMesai(String mesai) {
        this.mesai = mesai;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    @Override
    public void giris(){
        System.out.println(getAdsoyad()+" Memuru giris yapti");
    }
    public void cikis(){
        System.out.println(getAdsoyad()+" Memuru cikis yapti");
    }
    public void calis() {

    System.out.println("Calisti");
    }
}