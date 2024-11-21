package giorno1.ristorante;

import java.util.Scanner;

public class Chef extends Utente{

    private String psw = "chef123";

    Scanner sc = new Scanner(System.in);

    public Chef(String nome, String email) {
        super(nome, email);
    }

    public void aggiungiPiatto(){
        String piatto;
        System.out.println("Che piatto vuoi cucinare Chef?");
        piatto = sc.next();
        aggiungiPiatto(piatto);
    }

    public String getPsw() {
        return psw;
    }
}
