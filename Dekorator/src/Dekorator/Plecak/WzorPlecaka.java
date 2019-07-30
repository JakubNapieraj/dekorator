package Dekorator.Plecak;

import Dekorator.WzorPostaci;

public abstract class WzorPlecaka extends WzorPostaci {

    protected String opis = "Jescze nie ma opisu";

    public String stworzOpis() {
        return opis;
    }
}
