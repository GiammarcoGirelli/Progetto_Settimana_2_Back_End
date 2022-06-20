import Articolo.Articolo;
import Autore.Autore;
import Articolo.Tags;

import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Autore autore1 = new Autore(1, "Mario", "Mariottide");
        Autore autore2 = new Autore(2, "Remo", "Remotti");
        Autore autore3 = new Autore(3, "Carla", "Fracci");
        Autore autore4 = new Autore(4, "Ivan", "Drago");

        String[] tagCronaca = {"Cronaca", "Morti", "Omicidi"};
        String[] tagModa = {"vestiti", "moda"};
        String[] tagSpettacolo = {"spettacolo", "cultura"};
        String[] tagVideogames = {"videogame", "giochi", "egames"};

        Tags tag1 = new Tags(tagCronaca);
        Tags tag2 = new Tags(tagModa);
        Tags tag3 = new Tags(tagSpettacolo);
        Tags tag4 = new Tags(tagVideogames);

        Articolo articolo1 =  new Articolo(1, "Morti ammazzati", 04-05-1998, "Cronaca Nera", "Ieri sera, morti e ammazzati", autore1, tag1);
        Articolo articolo2 =  new Articolo(2, "Morti ammazzati nuovamente", 02-06-1996, "Cronaca Nera", "Ieri sera, morti e ammazzati, ma prima resuscitati", autore1, tag1);
        Articolo articolo3 =  new Articolo(3, "Mamma mia", 01-02-1995, "Spettacolo e cultura", "Mamma mia sorprende e delizia. Musiche degli ABBA", autore2, tag3);
        Articolo articolo4 =  new Articolo(4, "Nuovo videogame", 12-22-1999, "Giochi", "Olimpiadi eGames sempre più vicine", autore4, tag4);
        Articolo articolo5 =  new Articolo(5, "I love you baby", 11-05-1992, "Moda", "Vestiti alla moda per tutti i giorni", autore3, tag2);

        Articolo[] arrayBlog = {articolo1, articolo2, articolo3, articolo4, articolo5};

        Blog blog = new Blog(arrayBlog);

        collegamentoBlogAdEsecuzioneProgramma(blog);
    }

    public static void collegamentoBlogAdEsecuzioneProgramma(Blog blog) {
        System.out.println("Digita 'Articoli' per vedere tutti gli Articoli o digita 'ID' per effettuare la ricerca per ID");
        Scanner scanner = new Scanner(System.in);

        String selezioneUtente = scanner.nextLine();

        switch (selezioneUtente){
            case "Articoli": blog.stampaArticolo();
            break;

            case "ID":
                System.out.println("Seleziona numero ID dell'articolo desiderato");
                int id = scanner.nextInt();
                blog.selezionaArticoloPerId(id);
                break;



        }



    }
}
