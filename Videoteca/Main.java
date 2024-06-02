package Videoteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerS = new Scanner(System.in);
        Scanner scannerN = new Scanner(System.in);
        Videoteca videoteca = new Videoteca();
        boolean continua = true;
        int scelta;

        while (continua) {
            System.out.println("Operazioni disponibili:");
            System.out.println("1. Aggiungi film");
            System.out.println("2. Rimuovi film");
            System.out.println("3. Registra utente");
            System.out.println("4. Cancella utente");
            System.out.println("5. Noleggia film");
            System.out.println("6. Restituisci film");
            System.out.println("7. Elenco film disponibili");
            System.out.println("8. Elenco utenti registrati");
            System.out.println("9. Film noleggiati da utente X.");
            System.out.println("10. Esci");
            scelta = scannerN.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println("Inserisci il titolo del film:");
                    String titoloAggiungi = scannerS.nextLine();
                    System.out.println("Inserisci l'anno di uscita del film:");
                    int annoAggiungi = scannerN.nextInt();
                    Film filmAggiungi = new Film(titoloAggiungi, annoAggiungi);
                    videoteca.aggiungiFilm(filmAggiungi);
                    break;
                case 2:
                    System.out.println("Inserisci il nome del fim che vuoi rimuovere:");
                    String titoloRimuovi = scannerS.nextLine();
                    for(Film film : videoteca.listaFilm) {
                        if (film.getTitolo().equals(titoloRimuovi)) {
                            videoteca.rimuoviFilm(film);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Inserisci ID utente:");
                    String idAggiungi = scannerS.nextLine();
                    System.out.println("Inserisci nome utente:");
                    String nomeAggiungi = scannerS.nextLine();
                    Utente utenteAggiungi = new Utente(idAggiungi, nomeAggiungi);
                    videoteca.aggiungiUtente(utenteAggiungi);
                    break;
                case 4:
                    System.out.println("Inserisci il nome del'utente che vuoi rimouvere:");
                    String nomeRimuovi = scannerS.nextLine();
                    for (Utente utente : videoteca.listaUtenti) {
                        if (utente.getNome().equals(nomeRimuovi)) {
                            videoteca.rimuoviUtente(utente);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Inserisci l'nome dell'utente che vuole effettuare il noleggio:");
                    String nomeNoleggio = scannerS.nextLine();
                    System.out.println("Inserisci il titolo del film da noleggiare:");
                    String titoloNoleggio = scannerS.nextLine();
                    Film filmNoleggio = null;
                    Utente utenteNoleggio = null;

                    for(Utente utente: videoteca.listaUtenti){
                        if(utente.getNome().equals(nomeNoleggio)){
                            utenteNoleggio = utente;
                        }
                    }

                    for (Film film : videoteca.listaFilm) {
                        if (film.getTitolo().equals(titoloNoleggio)) {
                            filmNoleggio = film;
                        }
                    }

                    videoteca.noleggio(filmNoleggio, utenteNoleggio);
                    break;
                case 6:
                    System.out.println("Inserisci il nome del film restituito:");
                    String titoloRestituzione = scannerS.nextLine();
                    Film filmRestituzione = null;

                    for (Film film : videoteca.listaFilm) {
                        if (film.getTitolo().equals(titoloRestituzione)) {
                            filmRestituzione = film;
                        }
                    }

                    videoteca.restituzione(filmRestituzione);
                    break;
                case 7:
                    System.out.println("Film disponibili:");
                    videoteca.stampaFilm();
                    break;
                case 8:
                    System.out.println("Utenti registrati:");
                    videoteca.stampaUtenti();
                    break;
                case 9:
                    System.out.println("Inserisci il nome del'utente di cui vuoi vedere i suoi noleggi:");
                    String nome = scannerS.nextLine();
                    for(Utente utente: videoteca.listaUtenti){
                        if(utente.getNome().equals(nome)){
                            utente.elencoNoleggi();
                        }
                    }
                    break;
                case 10:
                    continua = false;
                    break;
            }
        }

        scannerN.close();
        scannerS.close();
    }
}