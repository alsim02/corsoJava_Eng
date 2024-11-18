import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while(flag){
            System.out.println("Inserire nome utente: ");
            String NomeUtente = sc.next();

            //Il nome utente non deve essere empty
            if(NomeUtente.length()==0){
                System.out.println("Nome Utente non valido");
            }

            System.out.println("Inserire password: ");
            String Password = sc.next();

            if(Password.equals(NomeUtente)){
                System.out.println("Utilizzare una password diversa dal nome utente !");
            }

            System.out.println("Inserire ID utente: ");
            int IDutente = sc.nextInt();

            if(IDutente<0){
                System.out.println("ID utente non valido");
            }

            System.out.println("Vuoi continuare ad inserire dati? Y|n: ");
            String risposta = sc.next();

            if(risposta.equals("n")){
                flag = false;
            }
        }
    }
}