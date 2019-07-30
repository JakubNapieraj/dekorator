package Dekorator.KlasyPostaci;

import Dekorator.WzorPostaci;

public class Tropiciel extends WzorPostaci {

   public Tropiciel(){
       this.imie = "Tropiciel";
   }


    @Override
    public int obrona() {
        return 50;
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
        return 10;
    }

    @Override
    public int pojemnoscPlecaka() {
        return 7;
    }

}
