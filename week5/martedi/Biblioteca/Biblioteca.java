package martedi.Biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Libro> elencoLibri;

    public Biblioteca() {
        elencoLibri = new ArrayList<>();
    }

    public String prestaLibro(Libro libro) {
        int numCop = libro.getNumeroCopie();
        int copPre = libro.getCopiePrestito();
        if (numCop == 0) {
            return "Errore, il libro " + libro.getTitolo() + " non è disponibile";
        } else {
            numCop--;
            libro.setNumeroCopie(numCop);
            copPre++;
            libro.setCopiePrestito(copPre);
            return "Libro prestato con successo";
        }
    }

    public String restituisciLibro(Libro libro) {
        int numCop = libro.getNumeroCopie();
        int copPre = libro.getCopiePrestito();
        if (copPre == 0) {
            return "Errore, il libro " + libro.getTitolo() + " non è stato stato prestato";
        } else {
            numCop++;
            libro.setNumeroCopie(numCop);
            copPre--;
            libro.setCopiePrestito(copPre);
            return "Libro restituito con successo";
        }
    }

    public void aggiungiLibro(Libro libro) {
        elencoLibri.add(libro);
    }

    public void rimuoviLibro(Libro libro) {
        elencoLibri.remove(libro);
    }

    public void stampaLibri() {
        for (Libro libro : elencoLibri) {
            System.out.println(libro.getTitolo() + ": " + libro.getNumeroCopie() + " copie disponibili");
        }
    }
}
