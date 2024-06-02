package week3.mercoledi.PiattoSpeciale;

import java.util.ArrayList;

public class PiattoSpeciale {
    private static final double prezzoBase = 1.00;
    private ArrayList<String> ingredientiPrivati;
    private ArrayList<String> ingredientiPubblici;
    private static final ArrayList<String> ingredientiDisponibili;
    private static final ArrayList<Double> prezziIngredienti;

    static {
        ingredientiDisponibili = new ArrayList<>();
        prezziIngredienti = new ArrayList<>();
        
        ingredientiDisponibili.add("Lattuga");
        prezziIngredienti.add(0.50);
        
        ingredientiDisponibili.add("Pomodoro");
        prezziIngredienti.add(0.75);
        
        ingredientiDisponibili.add("Formaggio");
        prezziIngredienti.add(1.00);
        
        ingredientiDisponibili.add("Panino Normale");
        prezziIngredienti.add(0.50);
        
        ingredientiDisponibili.add("Panino Sesamo");
        prezziIngredienti.add(0.75);
        
        ingredientiDisponibili.add("Prosciutto");
        prezziIngredienti.add(1.50);
        
        ingredientiDisponibili.add("Bacon");
        prezziIngredienti.add(1.25);
    }

    public PiattoSpeciale() {
        this.ingredientiPrivati = new ArrayList<>();
        this.ingredientiPubblici = new ArrayList<>();
    }

    public void aggiungiIngredientePrivato(String ingrediente) {
        if (ingredientiDisponibili.contains(ingrediente)) {
            ingredientiPrivati.add(ingrediente);
        } else {
            System.out.println("Ingrediente non disponibile");
        }
    }

    public void aggiungiIngredientePubblico(String ingrediente) {
        if (ingredientiDisponibili.contains(ingrediente)) {
            ingredientiPubblici.add(ingrediente);
        } else {
            System.out.println("Ingrediente non disponibile");
        }   
    }

    public double calcolaTotale() {
        double totale = prezzoBase;
        for (String ingrediente : ingredientiPrivati) {
            totale += prezziIngredienti.get(ingredientiDisponibili.indexOf(ingrediente));
        }
        for (String ingrediente : ingredientiPubblici) {
            totale += prezziIngredienti.get(ingredientiDisponibili.indexOf(ingrediente));
        }
        return totale;
    }

    public static void stampaIngredientiDisponibili() {
        System.out.println("Ingredienti disponibili:");
        for (int i = 0; i < ingredientiDisponibili.size(); i++) {
            System.out.println(ingredientiDisponibili.get(i) + ": " + prezziIngredienti.get(i) + " euro");
        }
    }
}
