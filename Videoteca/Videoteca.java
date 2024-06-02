package Videoteca;

import java.util.ArrayList;

public class Videoteca {
    ArrayList<Film> listaFilm;
    ArrayList<Utente> listaUtenti;

    public Videoteca() {
        listaFilm = new ArrayList<>();
        listaUtenti = new ArrayList<>();
    }

    public void aggiungiFilm(Film film) {
        listaFilm.add(film);
    }

    public void rimuoviFilm(Film film) {
        listaFilm.remove(film);
    }

    public void aggiungiUtente(Utente utente) {
        listaUtenti.add(utente);
    }

    public void rimuoviUtente(Utente utente) {
        listaUtenti.remove(utente);
    }

    public void noleggio(Film film, Utente utente) {
        if (listaFilm.contains(film)) {
            utente.noleggiaFilm(film);
            rimuoviFilm(film);
        } else {
            System.out.println("Film non disponibile");
        }
    }

    public void restituzione(Film film) {
        aggiungiFilm(film);
    }

    public void stampaUtenti() {
        System.out.println(listaUtenti);
    }

    public void stampaFilm() {
        System.out.println(listaFilm);
    }
}
