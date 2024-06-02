package week3.mercoledi.FabbricaDiPannaCotta;

import java.util.ArrayList;

public class PannaCotta {
    private String nome;
    private ArrayList<String> ingredienti;
    private double prezzo;

    public PannaCotta(String nome,ArrayList<String> ingredienti, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.ingredienti = ingredienti;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<String> getIngredienti() {
        return ingredienti;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIngredienti(ArrayList<String> ingredienti) {
        this.ingredienti = ingredienti;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void aggiungiIngredienti(String ingrediente) {
        ingredienti.add(ingrediente);
    }
}
