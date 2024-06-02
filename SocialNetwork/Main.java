package SocialNetwork;

import java.util.Scanner;
import java.util.ArrayList;

 public class Main {
    private String username;
    private String password;
    private ArrayList<String> database;

    public Main(String username, String password) {
        this.username = username;
        this.password = password;
        database = new ArrayList<>();
    }

    private void Login() {
        Scanner inputS = new Scanner(System.in);

        System.out.println("Benvenuto! Inserire username:");
        if (inputS.nextLine().equals(username)) {
            System.out.println("Inserire password:");
            if (inputS.nextLine().equals(password)) {
                System.out.println("Login effettuato con successo!");
            } else {
                System.out.println("Password errata");
            }
        } else {
            System.out.println("Username non trovato");
        }

        inputS.close();
    }

    private void Save() {

        Scanner inputS = new Scanner(System.in);
        Scanner inputN = new Scanner(System.in);

        boolean continuare = true;

        while (continuare) {
            System.out.println("Inserire il messaggio che vuoi salvare:");
            String messaggio = inputS.nextLine();
            database.add(messaggio);

            System.out.println("Vuoi salvare un altro messaggio? 1)Si 2)No");
            int scelta = inputN.nextInt();
            if (scelta == 2) {
                continuare = false;
            }
        }

        inputN.close();
        inputS.close();
    }

    private void Stamp() {

        System.out.println(database);
    }

    private void Modify() {

        Scanner inputN = new Scanner(System.in);
        Scanner inputS = new Scanner(System.in);

        System.out.println("Vuoi cambiare il tuo username? 1)Si 2)No");
        int scelta = inputN.nextInt();
        if (scelta == 1) {
            username = inputS.nextLine();
            System.out.println("Username cambiato con successo!");
        }

        System.out.println("Vuoi cambiare la tua password? 1)Si 2)No");
        scelta = inputN.nextInt();
        if (scelta == 1) {
            password = inputS.nextLine();
            System.out.println("Password cambiata con successo!");
        }

        inputN.close();
        inputS.close();
    }

    public static void main(String[] args) {
        
        Scanner inputN = new Scanner(System.in);

        Main user = new Main("Andra", "123");
        user.Login();
        user.Save();
        System.out.println("Ecco i messaggi che hai salvato:");
        user.Stamp();
        user.Modify();

        inputN.close();
    }
 }
