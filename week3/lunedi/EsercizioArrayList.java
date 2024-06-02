package week3.lunedi;

import java.util.ArrayList;
import java.util.Scanner;

public class EsercizioArrayList {
    public static void main(String[] args) {

        Scanner inputS = new Scanner(System.in);
        Scanner inputN = new Scanner(System.in);
        Scanner inputB = new Scanner(System.in);
        ArrayList<String> nomi = new ArrayList<String>();

        System.out.println("Quanti nomi vuoi aggiungere nella lista?");
        int nrNomi = inputN.nextInt();
        for(int i = 1; i <= nrNomi; i++) {
            System.out.println("Inserire il nome:");
            String nome = inputS.nextLine();
            nomi.add(nome);
        }

        System.out.println("Vuoi cercare un nome nella lista?");
        boolean cerca = inputB.nextBoolean();
        while (cerca) {
            System.out.println("Inserire un nome da cercare nella lista:");
            String nomeCerca = inputS.nextLine();
            boolean trovato = false;
            for(int i = 1; i <= nrNomi; i++) {
                if(nomi.get(i-1).equals(nomeCerca)) {
                    trovato = true;
                    break;
                }
            }
            if (trovato) {
                System.out.println("Nome trovato");
            }
            else {
                System.out.println("Nome non trovato");
            }
            System.out.println("Vuoi cercare un'altro nome?");
            cerca = inputB.nextBoolean();
        }

        System.out.println("Vuoi eliminare un nome dalla lista?");
        boolean elimina = inputB.nextBoolean();
        while (elimina) {
            System.out.println("Inserire un nome da eliminare dalla lista:");
            String nomeElim = inputS.nextLine();
            for(int i = 1; i <= nrNomi; i++) {
                if(nomi.get(i-1).equals(nomeElim)) {
                    nomi.remove(i-1);
                    nrNomi--;
                    break;
                }
            }
            System.out.println("Vuoi eliminare un'altro nome?");
            elimina = inputB.nextBoolean();
        }

        System.out.println(nomi);

        inputS.close();
        inputB.close();
        inputN.close();
    }
}
