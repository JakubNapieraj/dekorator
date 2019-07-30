package Dekorator.Plecak;

import Dekorator.WzorPostaci;

public class PlecakNike extends WzorPlecaka {

   private WzorPostaci wzorPostaci;

   public PlecakNike(WzorPostaci wzorPostaci){
       this.wzorPostaci = wzorPostaci;
   }

   @Override
   public String stworzOpis(){
       return wzorPostaci.stworzImie() +  ", z Plecakiem Nike";
   }


    @Override
    public int obrona() {
        return wzorPostaci.obrona();
    }

    @Override
    public int obronaMagiczna() {
        return wzorPostaci.obronaMagiczna();
    }

    @Override
    public int atakZwykły() {
        return wzorPostaci.atakZwykły();
    }

    @Override
    public int atakMagiczny() {
        return wzorPostaci.atakMagiczny();
    }

    @Override
    public int pojemnoscPlecaka() {
        return wzorPostaci.pojemnoscPlecaka() + 3;
    }
}
