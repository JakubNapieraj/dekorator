package Dekorator.Tarcza;

import Dekorator.WzorPostaci;

public abstract class WzorTarcza extends WzorPostaci {

    protected String opis = "Jescze nie ma opisu";

    public String stworzOpis() {
        return opis;
    }
}
