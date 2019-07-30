package Dekorator.Tarcza;

import Dekorator.WzorPostaci;

public class TarczaPaprykarz extends WzorTarcza {


    private WzorPostaci wzorPostaci;

    public TarczaPaprykarz(WzorPostaci wzorPostaci){
        this.wzorPostaci = wzorPostaci;
    }

    @Override
    public String stworzOpis(){
        return wzorPostaci.stworzImie() + ", z Tarczą Paprykarz";
    }

    @Override
    public int obrona() {
        return wzorPostaci.obrona() + 20;
    }

    @Override
    public int obronaMagiczna() {
        return wzorPostaci.obronaMagiczna() + 15;
    }

    @Override
    public int atakZwykły() {
        return wzorPostaci.atakZwykły() + 5;
    }

    @Override
    public int atakMagiczny() {
        return wzorPostaci.atakMagiczny() + 3;
    }

    @Override
    public int pojemnoscPlecaka() {
        return wzorPostaci.pojemnoscPlecaka()+1;
    }
}
