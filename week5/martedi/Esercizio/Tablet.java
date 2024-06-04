package martedi.Esercizio;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Tablet extends DispositivoElettronico {
    ArrayList<String> listaApp;

    public Tablet() {
        listaApp = new ArrayList<>();
    }

    public void aggiungiApp(String nomeApp) {
        listaApp.add(nomeApp);
    }

    public void rimuoviApp(String nomeApp) {
        listaApp.remove(nomeApp);
    }

    public void login(Scanner scanner, Utente utente) {
        System.out.println("Inserisci il nome:");
        String nome = scanner.nextLine();

        System.out.println("Inserisci la password:");
        String password = scanner.nextLine();

        if (utente.getNome().equals(nome)) {
            for (int i = 0; i < 4; i++) {
                if (utente.getPassword().equals(password)) {
                    System.out.println("Login effetuato con sucesso");
                    break;
                } else {
                    if (i == 3) {
                        System.out.println("Account bloccato");
                    } else {
                        System.out.println("Password errata, reinserire:");
                        password = scanner.nextLine();
                    }
                }
            }
        } else {
            System.out.println("Utente non trovato");
        }
    }

    public void setPunti(Utente utente) {
        Random random = new Random();
        utente.setPunti(random.nextInt(101));
    }

    public void setId(Utente utente, int i) {
        utente.setId(i);
    }

    public String avviaApplicazione(String nomeApp) {
        for (String app : listaApp) {
            if (app.equals(nomeApp)) {
                return "L'app " + nomeApp + "si sta avviando...";
            }
        }
        return "App non trovata";
    }

    public void stampaResoconto(Utente utente) {
        System.out.println("Nome: " + utente.getNome() + ", Password: " + utente.getPassword() + ", Punti: "
                + utente.getPunti() + ", Id: " + utente.getId());
    }
}
