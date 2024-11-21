package giorno1.ristorante;

import java.util.Scanner;

public class Critico extends Utente{

    private String psw = "critico123";

    Scanner sc = new Scanner(System.in);

    public Critico(String nome, String email) {
        super(nome, email);
    }


    public void aggiungiCritica(){
        String critica;
        System.out.println("Che valutazione vuoi fare?");
        critica = sc.next();
        aggiungiCritica(critica);
    }

    public String getPsw() {
        return psw;
    }
}
