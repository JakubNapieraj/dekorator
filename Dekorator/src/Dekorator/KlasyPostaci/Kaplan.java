package Dekorator.KlasyPostaci;

import Dekorator.WzorPostaci;

public class Kaplan extends WzorPostaci {

   public Kaplan(){
       this.imie = "Kaplan";
   }

    @Override
    public int obrona() {
        return 20;
    }

    @Override
    public int obronaMagiczna() {
        return 45;
    }

    @Override
    public int atakZwykły() {
        return 10;
    }

    @Override
    public int atakMagiczny() {
        return 30;
    }

    @Override
    public int pojemnoscPlecaka() {
        return 7;
    }

}
