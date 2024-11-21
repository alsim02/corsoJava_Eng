package giorno1.ristorante;

public class Utente extends Ristorante{

    private String nome;
    private String email;
    private float soldi = (float) (Math.random()*1000);

    public Utente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        nome = nome;
    }

    public void setEmail(String email) {
        email = email;
    }

    public String getEmail() {

        return email;
    }

    public float getSoldi() {

        return soldi;
    }

}
