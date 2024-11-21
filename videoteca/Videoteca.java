package giorno1.videoteca;

import java.util.ArrayList;

public class Videoteca {

    private ArrayList<Film> filmDisponibili = new ArrayList<Film>();
    private ArrayList<Utente> utentiNoleggiatori = new ArrayList<Utente>();
    private String nomeVideoteca;
    private int numeroFilmMassimi;

    public Videoteca(String nomeVideoteca, int numeroFilmMassimi) {
        this.nomeVideoteca = nomeVideoteca;
        this.numeroFilmMassimi = numeroFilmMassimi;
    }

    public void getUtentiNoleggiatori() {
        for(Utente x: utentiNoleggiatori){
            System.out.println(x.getIDutente());
        }
    }

    public int getNumeroFilmMassimi() {
        return numeroFilmMassimi;
    }

    public void aggiungiFilmVideoteca(Film f){
        filmDisponibili.add(f);
    }

    public void rimuoviFilmVideoteca(Film f){
        filmDisponibili.remove(f);
    }

    public void aggiungiUtenteNoleggiatore(Utente u){

        //Verifica se esiste già l'utente u
        boolean trovato = false;
        for(Utente x : utentiNoleggiatori){
            if(x.equals(u)){
                trovato = true;
                System.out.println("-Utente già presente nel sistema Videoteca-");
                break;
            }
        }
        //se non esiste, lo aggiungo alla lista aka Registrazione
        if(trovato == false){
            utentiNoleggiatori.add(u);
        }
    }

    public void aggiungiUtenteNoleggiatore(String IDutente, String nome){

        Utente u = new Utente(IDutente,nome);
        utentiNoleggiatori.add(u);

    }


    public void ricercaFilmPerTitolo(String titolo){

        for(Film f: filmDisponibili){
            if(f.getTitolo().equals(titolo)){
                System.out.println("Film trovato!");
                System.out.println(f.getAnnoUscita());
                System.out.println(f.getTitolo());
            }
        }
    }

    public void ricercaFilmPerUsicta(String annoUscita){

        for(Film f: filmDisponibili){
            if(f.getTitolo().equals(annoUscita)){
                System.out.println(f.getAnnoUscita());
                System.out.println(f.getTitolo());
            }
        }
    }

    //questo metodo deve essere invocato ogni volta che un utente prova a noleggiare un film
    public boolean disponibilitaFilm(Film f){
        for(Film x: filmDisponibili){
            if(x.equals(f)){
                return true;
            }
        }
        return false;
    }

    //questo metodo deve essere invocato ogni volta che un utente prova a noleggiare un film, in qunato deve registrarsi nella videoteca
    public boolean esisteUtente(String IDutente){
        for(Utente x: utentiNoleggiatori){
            if(x.getIDutente().equals(IDutente)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){

        Videoteca v = new Videoteca("A",3);

        Utente u1 = new Utente("a1","pippo");
        Utente u2 = new Utente("a2","topolino");

        v.aggiungiUtenteNoleggiatore(u1);
        //v.aggiungiUtenteNoleggiatore(u1); //se provo ad aggiungere lo stesso utente si triggera

        Film f1 = new Film("La grande G","1998",v);
        Film f2 = new Film("Quella volta in","2002",v);
        Film f3 = new Film("Qualcosa","2314",v);
        Film f4 = new Film("Paperopoli","1955",v);

        v.aggiungiFilmVideoteca(f1);
        v.aggiungiFilmVideoteca(f2);
        v.aggiungiFilmVideoteca(f3);
        v.aggiungiFilmVideoteca(f4);

        u1.noleggiaFilm(f1);
        u1.noleggiaFilm(f2);
        u1.noleggiaFilm(f3);
        //u1.noleggiaFilm(f4); //questo metodo triggera il controllo del numero massimo di noleggi possibili in una data videoteca

        u2.noleggiaFilm(f1);
        u2.noleggiaFilm(f1); //riprova a noleggiare il film, ora è registrato va a buon fine il processo

        v.getUtentiNoleggiatori();


    }


}
