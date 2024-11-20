package giorno1.biblioteca;

public class Libro {

    private String autore;
    private String titolo;
    private int numeroPagine;

    public Libro(String autore, int numeroPagine, String titolo){
        this.autore = autore;
        this.numeroPagine = numeroPagine;
        this.titolo = titolo;
    }

    public String getAutore(){
        return autore;
    }

    public int getPagine(){
        return numeroPagine;
    }

    public String getTitolo(){
        return titolo;
    }
}
