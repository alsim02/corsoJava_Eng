package giorno1.calcio;

public class Calciatore {

    private String nome;
    private String ruolo;

    public Calciatore(String nome, String ruolo){
        this.nome = nome;
        this.ruolo = ruolo;
    }

    public String getRuolo() {
        return ruolo;
    }

    public String getNome() {
        return nome;
    }
}
