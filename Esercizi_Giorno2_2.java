package giorno1;

import java.util.ArrayList;
import java.util.Scanner;

public class Esercizi_Giorno2_2 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //qui tengo traccia di tutte le spedizioni
        ArrayList<int[][]> spedizioni = new ArrayList<>();
        //Stringa del tipo "giorno-mese-anno"
        ArrayList<String> dataSpedizioni = new ArrayList<String>();
        String data = "";

        boolean continua = true;
        do{
            System.out.println("# Menu #");
            System.out.println("1. Aggiungi una Spedizione");
            System.out.println("2. Visualizza tutte le Spedizioni");
            System.out.println("3. Calcola il totale di penne per colore");
            System.out.println("4. Cerca almeno una Spedizione con un numero positivo di penne per dato Colore");
            int scelta = sc.nextInt();

            switch (scelta){
                case 1:
                    spedizioni.add(aggiungiSpedizione());
                    dataSpedizioni.add(impostaDataSpedizione());
                    break;
                case 2:
                    visualizzaDatiSpedizioni(spedizioni,dataSpedizioni);
                    break;
                case 3:
                    totalePennePerColore(spedizioni);
                    break;
                case 4:
                    System.out.println("Inserire un colore da cercare in una spedizione: Rosso, Blu, Verde, Nero: ");
                    String colore = sc.next();
                    cercaSpedizionePerColore(spedizioni, colore);
                    break;
            }

            System.out.println("Continuare? Y|n");
            String risposta = sc.next();
            if(risposta.equals("n")){
                continua=false;
            }

        }while(continua);

        sc.close();
    }

    public static int[][] aggiungiSpedizione(){
        int[][] mat = new int[4][1];

        int numeroPenne = 0;

        //String[] coloriStringhe = {"Rosso","Blu","Verde","Nero"};

        for(int i = 0; i<mat.length; i++){
            //System.out.println("Inserire numero di penne per il colore "+coloriStringhe[i]);
            //il numero di penne per ordine viene randomizzato, numero da 0 a 100
            //casting esplicito da double -> int
            numeroPenne = (int) (Math.random()*100);
        }

        return mat;
    }

    public static String impostaDataSpedizione(){
        System.out.println("Inserire data di spedizione nel formato g-m-a");
        String data = sc.next();
        return data;
    }

    public static void visualizzaDatiSpedizioni(ArrayList<int[][]> spedizioni, ArrayList<String> dataSpedizioni){

        int cont = 0; //contatore per le dataSpedizioni
        for(int[][] x: spedizioni){
            System.out.println("Spedizione numero: "+spedizioni.indexOf(x));
            for(int i = 0; i<x.length;i++){
                switch (i){
                    case 0:
                        System.out.println("Il numero di penne Rosse ordinate: " + x[i][0]);
                        break;
                    case 1:
                        System.out.println("Il numero di penne Blu ordinate: " + x[i][0]);
                        break;
                    case 2:
                        System.out.println("Il numero di penne Verde ordinate: " + x[i][0]);
                        break;
                    case 3:
                        System.out.println("Il numero di penne Nero ordinate: " + x[i][0]);
                        break;
                }
            }
            System.out.println("La spedizione partirà in data: "+dataSpedizioni.get(cont));
            cont++;
            System.out.println("-------------");
        }
    }

    public static void totalePennePerColore(ArrayList<int[][]> spedizioni){

        int totRosso = 0;
        int totBlu = 0;
        int totVerde = 0;
        int totNero = 0;

        for(int[][] x: spedizioni) {
            for(int i = 0; i<x.length;i++){
                switch (i){
                    case 0:
                        totRosso+=x[i][0];
                        break;
                    case 1:
                        totBlu+=x[i][0];
                        break;
                    case 2:
                        totVerde+=x[i][0];
                        break;
                    case 3:
                        totNero+=x[i][0];
                        break;
                }
            }
        }

        System.out.println("totale penne Rosse: "+totRosso);
        System.out.println("totale penne Blu: "+totBlu);
        System.out.println("totale penne Verdi: "+totVerde);
        System.out.println("totale penne Nere: "+totNero);

    }

    public static void cercaSpedizionePerColore(ArrayList<int[][]> spedizioni, String colore){
        //converto il colore nella riga della matrice
        int coloreNumerico = switch (colore) {
            case "Blu" -> 1;
            case "Verde" -> 2;
            case "Nero" -> 3;
            default -> 0;
        };

        for(int[][] x: spedizioni){
            if (x[coloreNumerico][0] > 0){
                System.out.println("Spedizione trovata, numero spedizione: "+spedizioni.indexOf(x));
                break;
            }
        }

    }


}
