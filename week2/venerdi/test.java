package venerdi;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner inputN = new Scanner(System.in);
        System.out.println("Quanti numeri pari tra 1 e 50 vuoi stampare?");
        int numeroPariStampati = inputN.nextInt();

        int somma = 0;

        if (numeroPariStampati > 0) {
            System.out.println("I primi " + numeroPariStampati + " numeri pari tra 1 e 50 sono:");
            int j = 1;
            for (int i = 2; i < 51 && j <= numeroPariStampati; i += 2) {
                System.out.println(i);
                somma += i;
                j++;
            }

            System.out.println("La somma dei primi " + numeroPariStampati + " numeri pari tra 1 e 50 e: " + somma);
        }

        Scanner inputB = new Scanner(System.in);
        System.out.println("Vuoi stampare i numeri pari tra 1 e 50 di un intervallo a tua scelta?");
        boolean risposta = inputB.nextBoolean();

        somma = 0;

        if (risposta) {
            System.out.println("Inserire l'inizio dell'intervallo:");
            int inizioIntervallo = inputN.nextInt();
            System.out.println("Inserire la fine dell'intervallo:");
            int fineIntervallo = inputN.nextInt();
            System.out.println("I numeri pari dell'intervallo [" + inizioIntervallo + ", " + fineIntervallo  + "] sono:");

            for(int i = inizioIntervallo; i <= fineIntervallo; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    somma += i;
                }
            }

            System.out.println("La somma dei numeri pari dell'intervallo [" + inizioIntervallo + ", " + fineIntervallo + "] e " + somma);
        }

        inputN.close();
        inputB.close();
    }

}