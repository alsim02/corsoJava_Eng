package giorno1.calcio;

import java.util.ArrayList;
import java.util.Scanner;

public class Squadra {

    private String nomeSquadra;
    private Calciatore[] componenti = new Calciatore[12];
    private int cont = 0;

    public Squadra(String nome){
        this.nomeSquadra = nome;
    }

    public String getNomeSquadra() {
        return nomeSquadra;
    }

    public void aggiungiGiocatore(Calciatore c){
        componenti[cont] = c;
        cont++;
    }

    public void getComponenti(){
        for(int i = 0; i<12; i++){
            System.out.println(componenti[i].getNome());
        }
    }



    public static void main(String[] args){

        String nome;
        String ruolo;
        Scanner sc = new Scanner(System.in);
        Squadra s = new Squadra("Milan");
        Squadra s1 = new Squadra("Juve");
        /*
        for(int i = 0; i < 12; i++){

            System.out.println("Inserire nome del calciatore");
            nome = sc.next();
            System.out.println("Inserire ruolo del giocatore");
            ruolo = sc.next();

            Calciatore c = new Calciatore(nome,ruolo);
            s.aggiungiGiocatore(c);

        }
        */
        /*
        System.out.println("La squadra : ");
        s.getComponenti();*/

        Squadra[] squadre = {s,s1};
        Partita p = new Partita("San Siro","10-04-20212",squadre );
        p.setRisultato();

    }

}
