package martedi.Biblioteca;

public class Libro {
    private String titolo;
    private int numeroCopie;
    private int copiePrestito;

    public Libro(String titolo, int numeroCopie, int copiePrestito) {
        this.titolo = titolo;
        this.numeroCopie = numeroCopie;
        this.copiePrestito = copiePrestito;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getNumeroCopie() {
        return numeroCopie;
    }

    public void setNumeroCopie(int numeroCopie) {
        this.numeroCopie = numeroCopie;
    }

    public int getCopiePrestito() {
        return copiePrestito;
    }

    public void setCopiePrestito(int copiePrestito) {
        this.copiePrestito = copiePrestito;
    }
}
