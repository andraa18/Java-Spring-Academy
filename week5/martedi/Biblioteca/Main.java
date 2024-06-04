package martedi.Biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerN = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca();
        boolean continua = true;

        while (continua) {
            System.out.println("Scegli un'opzione:");
            System.out.println("1) Aggiungi libro");
            System.out.println("2) Rimuovi libro");
            System.out.println("3) Lista libri disponibili");
            System.out.println("4) Presta libro");
            System.out.println("5) Restituisci libro");
            System.out.println("6) Esci");

            int scelta = scannerN.nextInt();
            switch (scelta) {
                case 1:
                    System.out.println("Inserisci il titolo del libro:");
                    String titoloAgg = scannerS.nextLine();
                    System.out.println("Inserisci il numero di copie disponibili");
                    int numCop = scannerN.nextInt();
                    Libro libroAgg = new Libro(titoloAgg, numCop, 0);
                    biblioteca.aggiungiLibro(libroAgg);
                    System.out.println("Libro aggiunto con successo");
                    break;
                case 2:
                    System.out.println("Inserisci il titolo del libro:");
                    String titoloRim = scannerS.nextLine();
                    for (Libro libroRim : biblioteca.elencoLibri) {
                        if (libroRim.getTitolo().equals(titoloRim)) {
                            biblioteca.rimuoviLibro(libroRim);
                        }
                    }
                    break;
                case 3:
                    biblioteca.stampaLibri();
                    break;
                case 4:
                    System.out.println("Inserisci il titolo del libro:");
                    String titoloPre = scannerS.nextLine();
                    for (Libro libroPre : biblioteca.elencoLibri) {
                        if (libroPre.getTitolo().equals(titoloPre)) {
                            biblioteca.prestaLibro(libroPre);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Inserisci il titolo del libro:");
                    String titoloRes = scannerS.nextLine();
                    for (Libro libroRes : biblioteca.elencoLibri) {
                        if (libroRes.getTitolo().equals(titoloRes)) {
                            biblioteca.rimuoviLibro(libroRes);
                        }
                    }
                    break;
                case 6:
                    continua = false;
                    break;
            }
        }

        scannerN.close();
        scannerS.close();
    }
}
