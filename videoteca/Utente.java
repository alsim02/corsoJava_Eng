package giorno1.videoteca;

import java.util.ArrayList;

public class Utente {

    private String IDutente;
    private String nome;
    private ArrayList<Film> filmNoleggiati = new ArrayList<Film>();

    public Utente(String IDutente, String nome) {
        this.IDutente = IDutente;
        this.nome = nome;
    }

    public String getIDutente() {
        return IDutente;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Film> getFilmNoleggiati() {
        return filmNoleggiati;
    }

    public void noleggiaFilm(Film f){

        // se l'utente è registrato allora può provare a noleggiare il film
        if(f.getVideotecaDiAppartenenza().esisteUtente(this.getIDutente())){

            // se non ha sforato la quantita massima di film noleggiabili AND il film che vuole noleggiare è disponibile, allora può noleggiare un altro film
            if(filmNoleggiatiInDataVideoteca(f.getVideotecaDiAppartenenza()) < f.getVideotecaDiAppartenenza().getNumeroFilmMassimi() && f.getVideotecaDiAppartenenza().disponibilitaFilm(f)){
                filmNoleggiati.add(f);
                /*
                qui dovrei rimuovere il film dalla lista della videoteca, per non renderlo più disponibile
                 */
            }else{
                System.out.println(f.getTitolo());
                System.out.println("Troppi film noleggiati nella stessa videoteca!");
            }
        }else{
            System.out.println("Registrati prima alla Videoteca!");
            f.getVideotecaDiAppartenenza().aggiungiUtenteNoleggiatore(this.IDutente, this.nome);
        }
    }

    public void elencoNoleggi(){
        System.out.println("Film Noleggiati ...");
        for(Film f: filmNoleggiati){
            System.out.println("-------------");
            System.out.println(f.getTitolo());
            System.out.println(f.getAnnoUscita());
        }
    }

    public int filmNoleggiatiInDataVideoteca(Videoteca istanzaDiVideoteca){
        int contVideoteca = 0;
        for(Film f:filmNoleggiati){
            if(f.getVideotecaDiAppartenenza() == istanzaDiVideoteca){
                contVideoteca++;
            }
        }
        return contVideoteca;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        //Casting
        Utente utente = (Utente) o;

        return this.IDutente == utente.getIDutente();
    }


}
