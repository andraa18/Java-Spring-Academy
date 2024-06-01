package mercoledi;
import java.util.Scanner;

public class E1 {
    
    public static void main(String[] args) {

        Scanner inputS = new Scanner(System.in);
        System.out.println("Inserisci nome utente:");
        String username = inputS.nextLine();

        Scanner inputN = new Scanner(System.in);
        System.out.println("Quanto fa 4*3?");
        int risposta = inputN.nextInt();

        int punti = 0;
        if(risposta == 12) {
            punti += 5;
            System.out.println("Coretto :)");
        }
        else {
            punti -= 5;
            System.out.println("Sbagliato :(");
        }

        System.out.println("Quanto fa 3^3?");
        risposta = inputN.nextInt();

        if(risposta == 27) {
            punti += 5;
            System.out.println("Coretto :)");
        }
        else {
            punti -= 5;
            System.out.println("Sbagliato :(");
        }

        System.out.println("Quanto fa 7*8?");
        risposta = inputN.nextInt();

        if(risposta == 56) {
            punti += 5;
            System.out.println("Coretto :)");
        }
        else {
            punti -= 5;
            System.out.println("Sbagliato :(");
        }

        //System.out.print(username);
        System.out.printf("%s: %d punti",username, punti);
        inputS.close();
        inputN.close();
    }
}