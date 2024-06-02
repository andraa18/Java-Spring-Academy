package Videoteca;

import java.util.ArrayList;

public class Utente {
    String id;
    String nome;
    ArrayList<Film> filmNoleggiati;

    public Utente(String id, String nome) {
        this.id = id;
        this.nome = nome;
        filmNoleggiati = new ArrayList<>();
    }

    public void noleggiaFilm(Film film) {
        filmNoleggiati.add(film);
    }

    public void elencoNoleggi() {
        System.out.println(filmNoleggiati);
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}