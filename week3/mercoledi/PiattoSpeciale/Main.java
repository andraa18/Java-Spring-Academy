package week3.mercoledi.PiattoSpeciale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerS = new Scanner(System.in);
        Scanner scannerN = new Scanner(System.in);
        boolean continua = true;

        while (continua) {
            PiattoSpeciale piatto = new PiattoSpeciale();

            System.out.println("Benvenuto! Ecco i nostri ingredienti disponibili:");
            PiattoSpeciale.stampaIngredientiDisponibili();

            System.out.println("Selezionare gli ingredienti pubblici:");
            boolean aggiungi = true;
            while (aggiungi) {
                String ingredientePubblico = scannerS.nextLine();
                piatto.aggiungiIngredientePubblico(ingredientePubblico);
                System.out.println("Vuoi selezionare un'altro ingrediente pubblico? 1)Si 2)No");
                int scelta = scannerN.nextInt();
                if (scelta == 2) {
                    aggiungi = false;
                }
            }

            System.out.println("Selezionare gli ingredienti privati:");
            aggiungi = true;
            while (aggiungi) {
                String ingredientePrivato = scannerS.nextLine();
                piatto.aggiungiIngredientePrivato(ingredientePrivato);
                System.out.println("Vuoi selezionare un'altro ingrediente privato? 1)Si 2)No");
                int scelta = scannerN.nextInt();
                if (scelta == 2) {
                    aggiungi = false;
                }
            }

            double totale = piatto.calcolaTotale();
            System.out.println("Il totale è: " + totale + "€");

            System.out.println("Vuoi ordinare un'altro Piatto Speciale? 1)Si 2)No");
            int scelta = scannerN.nextInt();
            if (scelta == 2) { 
                continua = false;
            }
        }

        scannerN.close();
        scannerS.close();
    }
}
