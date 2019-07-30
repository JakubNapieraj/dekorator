package Dekorator.Miecz;

import Dekorator.WzorPostaci;

public class MieczExcalibur extends WzorMiecza {

    private WzorPostaci wzorPostaci;

    public MieczExcalibur(WzorPostaci wzorPostaci) {
        this.wzorPostaci = wzorPostaci;
    }

    @Override
    public String stworzOpis() {
        return wzorPostaci.stworzImie() + ", z Mieczem Excalibur";
    }

    @Override
    public int obrona() {
        return wzorPostaci.obrona() + 10;
    }

    @Override
    public int obronaMagiczna() {
        return wzorPostaci.obronaMagiczna() + 5;
    }

    @Override
    public int atakZwykły() {
        return wzorPostaci.atakZwykły() + 30;
    }

    @Override
    public int atakMagiczny() {
        return wzorPostaci.atakMagiczny() + 5;
    }

    @Override
    public int pojemnoscPlecaka() {
        return wzorPostaci.pojemnoscPlecaka();
    }

}
