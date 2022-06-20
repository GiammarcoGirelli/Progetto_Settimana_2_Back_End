package SottoClassi;

import Articolo.Articolo;
import Autore.Autore;
import Articolo.Tags;

public class Fantasy extends Articolo {

    private String descrizione;

    public Fantasy(int id, String titolo, double data, String categoria, String testo, Autore autore, Tags tags, String descrizione) {
        super(id, titolo, data, categoria, testo, autore, tags);
        this.descrizione = descrizione;
    }
}
