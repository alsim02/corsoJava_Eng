package giorno1.ristorante;

import java.util.ArrayList;

public class Ristorante {

    private ArrayList<String> piatti = new ArrayList<>();
    private ArrayList<String> valutazioniPiatti = new ArrayList<>();

    public Ristorante() {
    }

    public void aggiungiPiatto(String piatto){
        piatti.add(piatto);
    }

    public void aggiungiCritica(String critica){
        valutazioniPiatti.add(critica);
    }

    public ArrayList<String> getPiatti() {
        return piatti;
    }

    public void setPiatti(ArrayList<String> piatti) {
        this.piatti = piatti;
    }

    public ArrayList<String> getValutazioniPiatti() {
        return valutazioniPiatti;
    }

    public void setValutazioniPiatti(ArrayList<String> valutazioniPiatti) {
        this.valutazioniPiatti = valutazioniPiatti;
    }
}
