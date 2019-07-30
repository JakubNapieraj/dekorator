package Dekorator;

public abstract class WzorPostaci {

    protected String imie = "Jeszcze nie nadałeś imienia swojej postaci  :(";



    public String stworzImie() {
        return imie ;
    }



    public abstract int obrona();

    public abstract int obronaMagiczna();

    public abstract int atakZwykły();

    public abstract int atakMagiczny();

    public abstract int pojemnoscPlecaka();

}
