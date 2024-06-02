package Videoteca;

public class Film {
    String titolo;
    int anno;
    
    public Film(String titolo, int anno) {
        this.titolo = titolo;
        this.anno = anno;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getAnno() {
        return anno;
    }
}