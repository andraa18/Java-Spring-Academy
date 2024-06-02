package week3.mercoledi.FabbricaDiPannaCotta;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerN = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        Fabbrica fabbrica = new Fabbrica();
        boolean continua = true;

        while (continua) {
            System.out.println("Scegli un'opzione:");
            System.out.println("1. Aggiungi Panna Cotta");
            System.out.println("2. Visualizza Panna Cotta");
            System.out.println("3. Cerca Panna Cotta");
            System.out.println("4. Esci");
            int scelta = scannerN.nextInt();

            switch (scelta) {
                case 1:
                    ArrayList<String> ingredienti = new ArrayList<>();
                    System.out.println("Inserisci il nome:");
                    String nome = scannerS.nextLine();
                    System.out.println("Inserisci il prezzo:");
                    double prezzo = scannerN.nextDouble();
                    System.out.println("Inserisci il tipo: 1)Frutta 2)Cioccolato");
                    int tipo = scannerN.nextInt();
                    if (tipo == 1) {
                        System.out.println("Inserisci il tipo di frutta:");
                        String tipoFrutta = scannerS.nextLine();
                        PannaCottaFrutta pannacotta = new PannaCottaFrutta(nome, ingredienti, prezzo, tipoFrutta);
                        fabbrica.aggiungiPannaCotta(pannacotta);
                        boolean aggiungi = true;
                        while (aggiungi) {
                            System.out.println("Inserisci l'ingredienti unor per uno:");
                            String ingrediente = scannerS.nextLine();
                            pannacotta.aggiungiIngredienti(ingrediente);
                            System.out.println("Vuoi aggiungere un'altro ingrediente? 1)Si 2)No");
                            scelta = scannerN.nextInt();
                            if (scelta == 2) {
                                aggiungi = false;
                            }
                        }
                    } else {
                        System.out.println("Inserisci il percentuale di cioccolato:");
                        double percentualeCioccolato = scannerN.nextDouble();
                        PannaCottaCioccolato pannacotta = new PannaCottaCioccolato(nome, ingredienti, prezzo, percentualeCioccolato);
                        fabbrica.aggiungiPannaCotta(pannacotta);
                        boolean aggiungi = true;
                        while (aggiungi) {
                            System.out.println("Inserisci l'ingredienti della Panna Cotta unor per uno:");
                            String ingrediente = scannerS.nextLine();
                            pannacotta.aggiungiIngredienti(ingrediente);
                            System.out.println("Vuoi aggiungere un'altro ingrediente? 1)Si 2)No");
                            scelta = scannerN.nextInt();
                            if (scelta == 2) {
                                aggiungi = false;
                            }
                        }
                    }
                    break;
                case 2:
                    fabbrica.visualizzaPannaCotta();
                    break;
                case 3:
                    System.out.println("Inserisci il nome della Panna Cotta che vuoi cercare:");
                    String nomeCerca = scannerS.nextLine();
                    boolean trovato = false;
                    for (PannaCotta pannacotta : fabbrica.getListaPannaCotta()) {
                        if (pannacotta.getNome().equals(nomeCerca)) {
                            trovato = true;
                        }
                    }
                    if (trovato) {
                        System.out.println("Panna Cotta trovata");
                    } else {
                        System.out.println("Panna Cotta non trovata");
                    }
                    break;
                case 4:
                    continua = false;
                    break;
            }
        }

        scannerN.close();
        scannerS.close();
    }
}
