package venerdi;
import java.util.Scanner;

public class E1 {
    
    public static void main(String[] args) {

        Scanner inputN = new Scanner(System.in);
        System.out.println("Inserire il numero di mesi lavorati in 2023:");
        int numeroMesi = inputN.nextInt();
        System.out.println("Inserire la percentuale di tasse:");
        int percentualeTase = inputN.nextInt();

        int stipendioAnnualeNetto = 0; 
        int stipendioAnnualeLordo = 0;
        
        for (int i = 1; i <= numeroMesi; i++) {
            System.out.println("Quanto hai guadagnato il mese numero " + i + "?");
            int X = inputN.nextInt();
            int stipendioNetto = X - ((X*percentualeTase)/100);
            stipendioAnnualeLordo += X;
            stipendioAnnualeNetto += stipendioNetto;
            System.out.println("Dopo la tasse ti sono rimasti:" + stipendioNetto);
        }

        System.out.println("In 2023 hai guadagnato: " + stipendioAnnualeLordo);
        System.out.println("Dopo la tasse ti sono rimasti: " + stipendioAnnualeNetto);
        System.out.println("La tua media senza tassi e: " + stipendioAnnualeLordo/numeroMesi + " e quella dopo la tasse e: " + stipendioAnnualeNetto/numeroMesi);
    
        inputN.close();
    }
}
