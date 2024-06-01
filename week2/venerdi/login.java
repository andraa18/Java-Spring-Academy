package venerdi;
import java.util.Scanner;

public class login {
    
    public static void main(String[] args) {

        // Scanner per leggere input numerico
        Scanner inputN = new Scanner(System.in);
        // Scanner per leggere input di stringhe
        Scanner inputS = new Scanner(System.in);

        // Variabili per memorizzare nuovo username e password
        String newUsername = " ";
        String newPassword1 = " ";
        String newPassword2 = " ";

        // Prompt per chiedere se l'utente ha già un account o vuole registrarsi
        System.out.println("Benvenuto! Hai gia un'account? 1)No. Registrazione 2)Sì. Login");
        int scelta = inputN.nextInt(); // Legge la scelta dell'utente

        // Se l'utente sceglie di registrarsi
        if (scelta == 1) {
            System.out.println("Inserire nome utente:");
            newUsername = inputS.nextLine(); // Legge il nuovo username

            System.out.println("Inserire password:");
            newPassword1 = inputS.nextLine(); // Legge la nuova password

            System.out.println("Reinserire password:");
            newPassword2 = inputS.nextLine(); // Chiede di reinserire la password

            int i = 1;
            // Controlla se le due password coincidono, fino a 3 tentativi
            while (newPassword1.equals(newPassword2) == false && i < 4) {
                System.out.println("Reinserire password:");
                newPassword2 = inputS.nextLine();
                i++;
            }
            if (i == 4) {
                // Se le password non coincidono dopo 3 tentativi, l'account non viene creato
                System.out.println("Password non corretta. Account non creato.");
                System.exit(0);
            }
            
            System.out.println("Registrazione effettuata con successo!");
            scelta = 2; // Procede automaticamente al login
        }

        // Se l'utente sceglie di effettuare il login
        if (scelta == 2) {
            System.out.println("Inserire nome utente:");
            String username = inputS.nextLine(); // Legge l'username

            int i = 1;
            // Controlla se l'username inserito corrisponde a quello registrato, fino a 3 tentativi
            while (newUsername.equals(username) == false && i < 4) {
                System.out.println("Reinserire username:");
                username = inputS.nextLine();
                i++;
            }
            if (i == 4) {
                // Se l'username non coincide dopo 3 tentativi, l'account non viene trovato
                System.out.println("Username non corretto. Account non trovato.");
                System.exit(0);
            }

            System.out.println("Inserire password:");
            String password = inputS.nextLine(); // Legge la password

            i = 1;
            // Controlla se la password inserita corrisponde a quella registrata, fino a 3 tentativi
            while (newPassword1.equals(password) == false && i < 4) {
                System.out.println("Reinserire password:");
                password = inputS.nextLine();
            }
            if (i == 4) {
                // Se la password non coincide dopo 3 tentativi, l'account non viene trovato
                System.out.println("Password non corretta. Account non trovato.");
                System.exit(0);
            }

            System.out.println("Login effettuata con successo! Benvenuto " + username);

            // Loop per ripetere il calcolo del quadrato di un numero
            boolean ripetere = true;
            while (ripetere) {
                System.out.println("Inserisci un numero per calcolare il suo quadrato:");
                int number = inputN.nextInt(); // Legge il numero inserito dall'utente
                System.out.println("Il quadrato di " + number + " è " + (number * number));

                // Chiede all'utente se vuole ripetere l'operazione
                System.out.println("Vuoi ripetere l'operazione? 1)Sì 2)No");
                scelta = inputN.nextInt();

                // Se l'utente sceglie di non ripetere, esce dal loop
                if (scelta == 2) {
                    ripetere = false;
                }
            }
        }

        System.out.println("Logout effettuato. Ciao!"); // Messaggio di logout

        // Messaggio di logout
        inputN.close();
        inputS.close();
    }
}
