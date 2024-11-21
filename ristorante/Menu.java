package giorno1.ristorante;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args){

        Utente[] listaUtenti = new Utente[1];

        Scanner sc = new Scanner(System.in);
        int scelta;

        String nome = "";
        String email = "";

        loop:
        while (true){
            System.out.println("1. Crea Utente");
            System.out.println("2. Stampare dati Utente");
            System.out.println("3. Esci");

            scelta = sc.nextInt();
            switch (scelta){
                case 1:
                    System.out.println("Inserire nome");
                    nome = sc.next();
                    System.out.println("Inserire email");
                    email = sc.next();
                    break;
                case 2:
                    Utente u = new Utente(nome, email);
                    listaUtenti[0] = u;
                    System.out.println(u.getNome());
                    System.out.println(u.getEmail());
                    System.out.println(u.getSoldi());
                    break;
                case 3:
                    break loop;
            }
        }

        String psw = "";

        loop2:
        while (true){
            System.out.println("1. Entare nel ruolo di Chef");
            System.out.println("2. Entare nel ruolo di Critico");
            System.out.println("3. Esci");

            scelta = sc.nextInt();
            switch (scelta){
                case 1:
                    System.out.println("Inserire la password per il ruolo Chef");
                    psw = sc.next();
                    //istanzio uno Chef
                    Chef c = new Chef(listaUtenti[0].getNome(),listaUtenti[0].getEmail());
                    if(c.getPsw().equals(psw)){
                        System.out.println("Sei uno Chef adesso!");
                    }
                    break;
                case 2:
                    System.out.println("Inserire la password per il ruolo Critico");
                    psw = sc.next();
                    //istanzio un critico
                    Critico cr = new Critico(listaUtenti[0].getNome(),listaUtenti[0].getEmail());
                    if(cr.getPsw().equals(psw)){
                        System.out.println("Sei un Critico adesso!");
                    }

                    break;
                case 3:
                    break loop2;
            }

        }


    }
}
