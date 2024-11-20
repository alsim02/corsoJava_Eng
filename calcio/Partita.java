package giorno1.calcio;

import java.util.Random;

public class Partita {

    private String nomeStadio;
    private String data;
    private Squadra[] squadre = new Squadra[2];
    private int risultato;

    public Partita(String stadio, String data, Squadra[] squadre){
        this.nomeStadio = stadio;
        this.data = data;
        this.squadre = squadre;
    }

    public void setRisultato(){
        Random rand = new Random();
        int risultato = rand.nextInt(3); //0 = vince suadra a index 0, 1 vince squadra a index 1, 2 pareggio

        switch (risultato){
            case 0:
                System.out.println("la squadra : "+squadre[0].getNomeSquadra()+" ha vinto");
                break;
            case 1:
                System.out.println("la squadra : "+squadre[1].getNomeSquadra()+" ha vinto");
                break;
            default:
                System.out.println("le squadre hanno pareggiato");
        }
    }



}
