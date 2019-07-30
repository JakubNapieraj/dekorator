package Dekorator.Tarcza;

import Dekorator.WzorPostaci;

public class TarczaBosh extends WzorTarcza{

    private WzorPostaci wzorPostaci;


    public TarczaBosh(WzorPostaci wzorPostaci){
        this.wzorPostaci = wzorPostaci;
    }

    @Override
    public String stworzOpis(){
        return wzorPostaci.stworzImie() + ", z Tarczą Bosh";
    }



    @Override
    public int obrona() {
        return wzorPostaci.obrona() + 30;
    }

    @Override
    public int obronaMagiczna() {
        return wzorPostaci.obronaMagiczna() + 20;
    }

    @Override
    public int atakZwykły() {
        return wzorPostaci.atakZwykły() +2;
    }

    @Override
    public int atakMagiczny() {
        return wzorPostaci.atakMagiczny() + 10;
    }

    @Override
    public int pojemnoscPlecaka() {
        return wzorPostaci.pojemnoscPlecaka() + 2;
    }
}
