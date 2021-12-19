package com.company;

public class Main {

    public static void main(String[] args) {
     Akademisyen a1=new Akademisyen("sedanur","seda@","yazilim","doc");
     Memur m1=new Memur("mehmetdemir","221","ali@","08.00","marketing");
     Ogretim_Gorevlisi o1=new Ogretim_Gorevlisi("tugceel","333","tugce@","BM",11);
     Asistan as1=new Asistan("erdemay","156","erdem@","EEM","12.00-16.00");
     System.out.println(as1.getUnvan());
     System.out.println(o1.getUnvan());
     m1.cikis();
    }
}
