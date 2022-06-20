import Articolo.Articolo;

public class Blog {
    private Articolo[] arrayBlog;

    public Blog(Articolo[] arrayBlog) {
        this.arrayBlog = arrayBlog;
    }

    public Articolo[] getArrayBlog() {
        return arrayBlog;
    }

    public void setArrayBlog(Articolo[] arrayBlog) {
        this.arrayBlog = arrayBlog;
    }
    public void selezionaArticoloPerId(int id){
        for (int i = 0; i < arrayBlog.length; i++){
            if (arrayBlog[i].getId() == id){
                System.out.println("Hai selezionato l'articolo: " + (i+1) + " Titolo articolo: " + arrayBlog[i].getTitolo() + " Categoria: " + arrayBlog[i].getCategoria() + " Scritto da: " + arrayBlog[i].getAutore() + " Articolo: " + arrayBlog[i].getTesto());
            }
        }
    }

    public void stampaArticolo(){
        for (int i = 0; i < arrayBlog.length; i++){
            System.out.println(" Numero articolo: " + (i+1) + ", " + arrayBlog[i].getAutore() + ", " + " Categoria : " + arrayBlog[i].getCategoria() + ", " + " Testo Articolo: " + arrayBlog[i].getTesto());
        }
    }
}
