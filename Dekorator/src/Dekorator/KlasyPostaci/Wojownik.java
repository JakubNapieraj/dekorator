package Dekorator.KlasyPostaci;

import Dekorator.WzorPostaci;

public class Wojownik extends WzorPostaci {

    public Wojownik(){
        this.imie = "Wojownik";
    }

    @Override
    public int obrona() {
        return 45;
    }

    @Override
    public int obronaMagiczna() {
        return 20;
    }

    @Override
    public int atakZwykły() {
        return 65;
    }

    @Override
    public int atakMagiczny() {
        return 10;
    }

    @Override
    public int pojemnoscPlecaka() {
        return 4;
    }

}
