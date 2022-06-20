package Autore;

import Articolo.Articolo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Autore implements Scrittore{


    protected int id;

    protected String nome;

    protected String cognome;

    public Autore(int id, String nome, String cognome) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Override
    public Articolo scriviArticolo(Articolo articolo) {
        articolo.setAutore(articolo.getAutore());
        return articolo;
    }

    @Override
    public String toString() {
        return "Autore = {" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                '}';
    }
}

