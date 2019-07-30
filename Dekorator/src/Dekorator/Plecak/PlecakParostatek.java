package Dekorator.Plecak;

import Dekorator.WzorPostaci;

public class PlecakParostatek extends WzorPlecaka {

   private WzorPostaci wzorPostaci;

   public PlecakParostatek(WzorPostaci wzorPostaci){
       this.wzorPostaci = wzorPostaci;
   }

   @Override
   public String stworzOpis(){
       return wzorPostaci.stworzImie() + ", z Plecakiem Parostatek";
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
        return wzorPostaci.pojemnoscPlecaka() + 4;
    }
}
