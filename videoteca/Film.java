package giorno1.videoteca;

public class Film {

    private String titolo;
    private String annoUscita;
    private Videoteca videotecaDiAppartenenza;

    public Film(String titolo, String annoUscita, Videoteca videotecaDiAppartenenza){
        this.titolo = titolo;
        this.annoUscita = annoUscita;
        this.videotecaDiAppartenenza = videotecaDiAppartenenza;
    }

    public Videoteca getVideotecaDiAppartenenza() {
        return videotecaDiAppartenenza;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAnnoUscita() {
        return annoUscita;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAnnoUscita(String annoUscita) {
        this.annoUscita = annoUscita;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        //Casting
        Film film = (Film) o;

        return this.titolo == film.getTitolo();
    }
}
