import java.util.ArrayList;
import java.util.Scanner;

public class Esercizi_Giorno2_1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //lista delle persone che hanno prenotato
        ArrayList<String> persone = new ArrayList<String>();
        //matrice dei posti prenotabili
        String[][] posti = new String[3][8];

        //variabile che serve a popolare la matrice dei posti in maniera progressiva, da 1  a 24
        int posizione = 1;

        //doppio ciclo annidato for per popolare la matrice dei posti dei numeri segna posto
        for(int righe = 0; righe < posti.length; righe++){
            for(int colonne = 0; colonne < posti[righe].length; colonne++){
                posti[righe][colonne] = posizione+" ";
                posizione++;
            }
        }

        //contatore che mi serve per il Report
        int numeroPostiPrenotati = 0;

        //variabile di controllo per il ciclo do-while
        boolean continuo = true;

        System.out.println("Posti");

        System.out.println("------------------------------------");
        // Visualizzo tutti i posti ad ogni ciclo
        for(int righe = 0; righe < posti.length; righe++){
            for(int colonne = 0; colonne < posti[righe].length; colonne++){
                System.out.print(posti[righe][colonne]+" ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------");

        do{
            System.out.println("# Menù #");
            System.out.println("1. Effettua Prenotazione");
            System.out.println("2. Cerca Prenotazione");
            System.out.println("3. Visualizzo tutti i posti attualmente prenotati e disponibili");
            System.out.println("4. Report");
            System.out.println("Inserire scelta: ");
            int sceltaMenu = sc.nextInt();

            switch (sceltaMenu){
                case 1:
                    System.out.println("------------------------------------");
                    System.out.println("Effettua Prenotazione");
                    System.out.println("Inserire il tuo nome: ");
                    String nome = sc.next();
                    System.out.println("Che posto si vuole prentare? Specificare numero posto: ");
                    int posto = sc.nextInt();
                    //flag per controllare se si tenta di prenotare un posto già occupato
                    int inserimentoAndatoBene = 0;

                    for(int righe = 0; righe < posti.length; righe++){
                        for(int colonne = 0; colonne < posti[righe].length; colonne++) {
                            if(posti[righe][colonne].equals(posto+" ")){
                                posti[righe][colonne] = nome;
                                inserimentoAndatoBene = 1;
                            }
                        }
                    }

                    if(inserimentoAndatoBene == 0){
                        System.out.println("Prenotazione non è andata a buon fine, posto già occupato");
                    }else{
                        //se l'inserimento è andato a buon fine aggiungo la persona alla lista
                        persone.add(nome);
                        numeroPostiPrenotati+=1;
                    }
                    System.out.println("------------------------------------");
                    break;
                case 2:
                    System.out.println("Cerca Prenotazione");
                    System.out.println("Specificare nome:");
                    String nomeDaRicercare = sc.next();
                    //flag per controllare se la persona esiste nella lista dei prenotati
                    int flag = 0;
                    for(String x : persone){
                        if(nomeDaRicercare.equals(x)){
                            System.out.println("Prenotazione Trovata");
                            flag = 1;
                            break;
                        }
                    }
                    // se la persona esiste nella lista...
                    if(flag == 1){
                        System.out.println("Cerco il posto prenotato ... ");

                        for(int righe = 0; righe < posti.length; righe++){
                            for(int colonne = 0; colonne < posti[righe].length; colonne++){
                                if(posti[righe][colonne].equals(nomeDaRicercare)){
                                    System.out.println("Fila "+(righe+1));
                                    System.out.println("Posto "+(colonne+1));
                                    break;
                                }
                            }
                        }
                    }else{
                        System.out.println("Il nome non è stato trovato, ci dispiace");
                    }
                    System.out.println("------------------------------------");
                    break;
                case 3:
                    System.out.println("Visualizzo tutti i posti attualmente prenotati e disponibili");
                    System.out.println("------------------------------------");
                    for(int righe = 0; righe < posti.length; righe++){
                        for(int colonne = 0; colonne < posti[righe].length; colonne++){
                            System.out.print(posti[righe][colonne]+" ");
                        }
                        System.out.println();
                    }
                    System.out.println("------------------------------------");
                    break;
                case 4:
                    //Report
                    System.out.println("Report attuale: ");
                    System.out.println("Numero di posti prenotati: "+numeroPostiPrenotati);
                    System.out.println("Numero di posti NON prenotati: "+ (24 - numeroPostiPrenotati));
                    break;
                default:
                    System.out.println("Scelta non disponibile");
            }

            //porzione di codice che serve per continuare o no l'inserimento dei dati
            System.out.println("Continuare? Y|n");
            String risposta = sc.next();
            if(risposta.equals("n")){
                continuo = false;
            }

        }while(continuo == true);
    }
}
