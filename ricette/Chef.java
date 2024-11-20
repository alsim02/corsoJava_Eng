package giorno1.ricette;

import java.util.ArrayList;

public class Chef {

    private String nome;
    private String tipo;
    private ArrayList<String> ingredienti;

    public Chef(String nome, String tipo, ArrayList<String> ingredienti){

        this.nome = nome;
        this.tipo = tipo;
        this.ingredienti = ingredienti;

    }
    public void creaPiatto(){

        System.out.println("Lo chef "+nome+" sta preparando un "+tipo);
        switch (tipo){
            case "primo":
                Pietanza primo = new Pietanza(ingredienti);
                primo.getPietanza();
                break;
            case "secondo":
                Pietanza secondo = new Pietanza(ingredienti);
                secondo.getPietanza();
                break;
            case "dolce":
                Pietanza dolce = new Pietanza(ingredienti);
                dolce.getPietanza();
                break;
            case "antipasto":
                Pietanza antipasto = new Pietanza(ingredienti);
                antipasto.getPietanza();
                break;
        }
    }

    public static void main(String[] args){

        ArrayList<String> ingr = new ArrayList<>();
        ingr.add("pasta");

        Chef c = new Chef("Mario","primo",ingr );
        c.creaPiatto();
    }


}
