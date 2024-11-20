package giorno1.biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> raccolta = new ArrayList<Libro>();
    //istanza singleton di Biblioteca
    private static Biblioteca b = new Biblioteca();

    //costruttore
    public Biblioteca(){

    }

    //tramite questo costruttore inizializzo una raccolta intera
    public Biblioteca(ArrayList<Libro> libri){
        this.raccolta = libri;

    }

    public void aggiungiLibro(Libro l){
        raccolta.add(l);
    }

    //tramite questo metodo stampo tutti i libri presenti in biblioteca
    public void getLibriBiblioteca(){
        for(Libro x: raccolta){
            System.out.println("Titolo: "+x.getTitolo());
            System.out.println("Autore: "+x.getAutore());
            System.out.println("Numero Pagine: "+x.getPagine());
        }
    }
    //overloading
    public void cercaLibroPerParametro(String nome){
        for(Libro x: b.getRaccolta()){
            if(x.getAutore().equals(nome)){
                System.out.println("---------------------------------");
                System.out.println("Libro trovato...");
                System.out.println("Titolo: "+x.getTitolo());
                System.out.println("Autore: "+x.getAutore());
                System.out.println("Numero Pagine: "+x.getPagine());
                System.out.println("---------------------------------");
            }
        }
    }
    //overloading
    public void cercaLibroPerParametro(int pagine){
        for(Libro x: b.getRaccolta()){
            if(x.getPagine()==pagine){
                System.out.println("---------------------------------");
                System.out.println("Libro trovato...");
                System.out.println("Titolo: "+x.getTitolo());
                System.out.println("Autore: "+x.getAutore());
                System.out.println("Numero Pagine: "+x.getPagine());
                System.out.println("---------------------------------");
            }
        }
    }

    public ArrayList<Libro> getRaccolta(){
        return raccolta;
    }


    public static void main(String[] args){

        Libro primo = new Libro("Massimo",535,"Nel mondo fantastico");
        b.aggiungiLibro(primo);
        Libro secondo = new Libro("Bob",43,"Nel mondo di y");
        b.aggiungiLibro(secondo);
        Libro terzo = new Libro("Alex",999,"Nel mondo di x");
        b.aggiungiLibro(terzo);

        b.getLibriBiblioteca();
        b.cercaLibroPerParametro(999);
        b.cercaLibroPerParametro("Massimo");

    }
}
