package SocialNetwork;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    
    static void LogIn(String username, String password) {
        Scanner inputS = new Scanner(System.in);

        System.out.println("Benvenuto! Inserire username:");
        username = inputS.nextLine();

        System.out.println("Inserire password:");
        password = inputS.nextLine();

        inputS.close();
    }

    static void Save(ArrayList<String> database) {

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

    static void Stamp(ArrayList<String> database) {

        System.out.println(database);
    }

    static void Modify(String username, String password) {

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

        String username = "";
        String password = "";
        LogIn(username, password);
        ArrayList<String> database = new ArrayList<String>();

        System.out.println("Vuoi salvare un messaggio? 1)Si 2)No");
        int scelta = inputN.nextInt();
        if (scelta == 1) {
            Save(database);
            System.out.println("Ecco i messaggi che hai salvato:");
            Stamp(database);
        }

        Modify(username, password);
        inputN.close();
    }
}
