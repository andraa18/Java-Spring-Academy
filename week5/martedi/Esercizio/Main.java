package martedi.Esercizio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Utente utente = new Utente("Andra", "123");
        int i = 1;

        System.out.println("Scegli il tuo dispositivo: 1)Smartphone 2)Tablet");
        int scelta = scanner.nextInt();

        switch (scelta) {
            case 1:
                Smartphone smartphone = new Smartphone();

                smartphone.login(scanner, utente);

                System.out.println("Vuoi aggiungere un'app?");
                if (scanner.nextLine().trim().equals("si")) {
                    System.out.println("Inserire il nome deel'app:");
                    smartphone.aggiungiApp(scanner.nextLine().trim());
                }

                System.out.println("Vuoi rimuovere un'app?");
                if (scanner.nextLine().trim().equals("si")) {
                    System.out.println("Inserire il nome deel'app:");
                    String nomeRim = scanner.nextLine();
                    for (String app : smartphone.listaApp) {
                        if (app.equals(nomeRim)) {
                            smartphone.rimuoviApp(nomeRim);
                        }
                    }
                }

                System.out.println("Inserire il nome dell'app che vuoi usare:");
                String nomeAppS = scanner.nextLine();
                smartphone.avviaApplicazione(nomeAppS);

                smartphone.stampaResoconto(utente);
                break;
            case 2:
                Tablet tablet = new Tablet();

                tablet.login(scanner, utente);
                tablet.setPunti(utente);
                tablet.setId(utente, i);
                i++;

                System.out.println("Vuoi aggiungere un'app?");
                if (scanner.nextLine().trim().equals("si")) {
                    System.out.println("Inserire il nome deel'app:");
                    tablet.aggiungiApp(scanner.nextLine().trim());
                }

                System.out.println("Vuoi rimuovere un'app?");
                if (scanner.nextLine().trim().equals("si")) {
                    System.out.println("Inserire il nome deel'app:");
                    String nomeRim = scanner.nextLine();
                    for (String app : tablet.listaApp) {
                        if (app.equals(nomeRim)) {
                            tablet.rimuoviApp(nomeRim);
                        }
                    }
                }

                System.out.println("Inserire il nome dell'app che vuoi usare:");
                String nomeAppT = scanner.nextLine();
                tablet.avviaApplicazione(nomeAppT);

                tablet.stampaResoconto(utente);
                break;
        }

        scanner.close();
    }
}
