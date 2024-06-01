package giovedi;
import java.util.Scanner;

public class E1 {
    
    public static void main(String[] args) {

        Scanner inputS = new Scanner(System.in);
        System.out.println("Inserisci nome:");
        String nome = inputS.nextLine();

        Scanner inputN = new Scanner(System.in);
        System.out.println("Inserisci eta:");
        int eta = inputN.nextInt();

        System.out.println("Inserisci classe:");
        String classe = inputS.nextLine();

        char charN = classe.charAt(0), charL = classe.charAt(classe.length() - 1);
        int caso = 0, classeN = Integer.parseInt(String.valueOf(charN));
        if(classeN < 9) {
            caso = 1;
        }
        else if (eta > 18) {
            caso = 2;
        }
        else if (charL == 'C' || charL == 'D') {
            caso = 3;
        }

        switch (caso) {
            case 1:
                System.out.printf("%s: Studente non liceale",nome);
                break;
            case 2:
                System.out.printf("%s: Studente universitario",nome);
                break;
            case 3:
                System.out.printf("%s: Studente profilo reale",nome);
                break;
            default:
                System.out.printf("%s: Studente profilo umano",nome);
                break;
        }

        inputN.close();
        inputS.close();
    }
}