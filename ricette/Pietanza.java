package giorno1.ricette;

import java.util.ArrayList;

public class Pietanza {

    private ArrayList<String> ingredienti = new ArrayList<>();

    public Pietanza(ArrayList<String> ingredienti){

        this.ingredienti=ingredienti;
    }

    public void getPietanza(){
        if(ingredienti.contains("pollo") || ingredienti.contains("patate") ){
            System.out.println("spezzatino di pollo");
        }
        if(ingredienti.contains("pasta")){
            System.out.println("carbonara");
        }
        if(ingredienti.contains("affettati")){
            System.out.println("antipasto di terra");
        }
        if(ingredienti.contains("cioccolato")){
            System.out.println("torta");
        }
    }

}
