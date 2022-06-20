package Articolo;

import Autore.Autore;

public class Articolo{

    private int id;

    private String titolo;

    private double data;

    private String categoria;

    private String testo;

    private Autore autore;

    private Tags tags;


    public Articolo(int id, String titolo, double data, String categoria, String testo, Autore autore, Tags tags) {
        this.id = id;
        this.titolo = titolo;
        this.data = data;
        this.categoria = categoria;
        this.testo = testo;
        this.autore = autore;
        this.tags = tags;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public Autore getAutore() {
        return autore;
    }

    public void setAutore(Autore autore) {
        this.autore = autore;
    }

    public Tags getTags() {
        return tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Articolo{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", data=" + data +
                ", categoria='" + categoria + '\'' +
                ", testo='" + testo + '\'' +
                ", autore=" + autore +
                ", tags=" + tags +
                '}';
    }
}