package Dekorator.Miecz;

import Dekorator.WzorPostaci;

public class MieczYamashita extends WzorMiecza {

    private WzorPostaci wzorPostaci;

    public MieczYamashita(WzorPostaci wzorPostaci) {
        this.wzorPostaci = wzorPostaci;
    }

    @Override
    public String stworzOpis() {
        return wzorPostaci.stworzImie() + ", z Mieczem Yamashita";
    }


    @Override
    public int obrona() {
        return wzorPostaci.obrona() + 5;
    }

    @Override
    public int obronaMagiczna() {
        return wzorPostaci.obronaMagiczna() + 3;
    }

    @Override
    public int atakZwykły() {
        return wzorPostaci.atakZwykły() + 20;
    }

    @Override
    public int atakMagiczny() {
        return wzorPostaci.atakMagiczny() + 2;
    }

    @Override
    public int pojemnoscPlecaka() {
        return wzorPostaci.pojemnoscPlecaka();
    }

}
