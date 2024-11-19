package giorno2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Esercizi_Giorno2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ese1(sc);
        ese2();
    }

    public static void ese1(Scanner sc){
        // esercizio 1 della slide
        System.out.println("# Esercizio 1 #");

        List<Integer> array = new ArrayList<>();

        int x;
        do{
            System.out.println("Inserire un numero: ");
            x = sc.nextInt();

            if(x>=0){

                array.add(x);

                if(x%2 == 0){
                    System.out.println("Il numero "+x+" è pari");
                }else{
                    System.out.println("Il numero "+x+" è dispari");
                }
            }

        }while(x>0);

        for(int elemento: array){
            System.out.println(elemento);
        }
    }

    public static void ese2(){
        // esercizio 2 della slide
        System.out.println("# Esercizio 2 #");
        for(int i = 1; i<8; i++){
            switch (i){
                case 1:
                    System.out.println("Lunedi");
                    break;
                case 2:
                    System.out.println("Martedi");
                    break;
                case 3:
                    System.out.println("Mercoledi");
                    break;
                case 4:
                    System.out.println("Giovedi");
                    break;
                case 5:
                    System.out.println("Venerdi");
                    break;
                case 6:
                    System.out.println("Sabato");
                    break;
                case 7:
                    System.out.println("Domenica");
                    break;
                default:
            }
        }

    }



}
