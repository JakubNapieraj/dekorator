package Dekorator.Miecz;

import Dekorator.WzorPostaci;

public abstract class WzorMiecza extends WzorPostaci {

    protected String opis = "Jescze nie ma opisu";

    public String stworzOpis() {
        return opis;
    }

}
