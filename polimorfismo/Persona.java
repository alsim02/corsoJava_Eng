package giorno1.polimorfismo;

public class Persona {

    private String nome;

    public Persona(String nome) {
        this.nome = nome;
    }

    public void saluta(){
        System.out.println("Ciao");
    }

    public static void main(String[] args){
        Persona p1 = new Persona("Alex");
        p1.saluta();

        Persona p3 = new Pirata("Barbossa");
        p3.saluta();

        Pirata pi = new Pirata("Barbarossa");
        p1.saluta();

    }
}

class Pirata extends Persona{


    public Pirata(String nome) {
        super(nome);
    }

    @Override
    public void saluta() {
        System.out.println("Ciao, sono un Pirata");
    }

}