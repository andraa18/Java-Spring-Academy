package week3.lunedi;

import java.util.Scanner;

public class EsercizioOperazioni {
    public static void main(String[] args) {

        Scanner inputN = new Scanner(System.in);
        Scanner inputB = new Scanner(System.in);

        System.out.println("Con quale operazione vuoi procedere? 1)massimo di 2 numeri 2)minimo di 2 numeri 3)radice quadrata di un numero 4)quadrato di un numero?");
        int scelta = inputN.nextInt();
        int contatore[] = {0, 0, 0, 0};
        boolean continuare = true;

        while (continuare) {
            if (scelta == 1) {
                System.out.println("Inserire il primo numero:");
                int N1 = inputN.nextInt();
                System.out.println("Inserire il secondo numero:");
                int N2 = inputN.nextInt();
                int massimo = Math.max(N1, N2);
                System.out.println("Il massimo tra i due numeri è: " + massimo);
                contatore[scelta - 1]++;
                System.out.println("Vuoi fare un'altra operazione?");
                continuare = inputB.nextBoolean();
                if (continuare) {
                    System.out.println("Con quale operazione vuoi procedere? 1)massimo di 2 numeri 2)minimo di 2 numeri 3)radice quadrata di un numero 4)quadrato di un numero?");
                    scelta = inputN.nextInt();
                }
            }
            else if (scelta == 2) {
                System.out.println("Inserire il primo numero:");
                int N1 = inputN.nextInt();
                System.out.println("Inserire il secondo numero:");
                int N2 = inputN.nextInt();
                int minimo = Math.min(N1, N2);
                System.out.println("Il minimo tra i due numeri è: " + minimo);
                contatore[scelta - 1]++;
                System.out.println("Vuoi fare un'altra operazione?");
                continuare = inputB.nextBoolean();
                if (continuare) {
                    System.out.println("Con quale operazione vuoi procedere? 1)massimo di 2 numeri 2)minimo di 2 numeri 3)radice quadrata di un numero 4)quadrato di un numero?");
                    scelta = inputN.nextInt();
                }
            }
            else if (scelta == 3) {
                System.out.println("Inserire il numero:");
                int N = inputN.nextInt();
                int radice = (int) Math.sqrt(N);
                System.out.println("La radice quadrata di " + N + " è: " + radice);
                contatore[scelta - 1]++;
                System.out.println("Vuoi fare un'altra operazione?");
                continuare = inputB.nextBoolean();
                if (continuare) {
                    System.out.println("Con quale operazione vuoi procedere? 1)massimo di 2 numeri 2)minimo di 2 numeri 3)radice quadrata di un numero 4)quadrato di un numero?");
                    scelta = inputN.nextInt();
                }
            }
            else {
                System.out.println("Inserire il numero:");
                int N = inputN.nextInt();
                int quadrato = (int) Math.pow(N, 2);
                System.out.println("Il quadrato di " + N + " è: " + quadrato);
                contatore[scelta - 1]++;
                System.out.println("Vuoi fare un'altra operazione?");
                continuare = inputB.nextBoolean();
                if (continuare) {
                    System.out.println("Con quale operazione vuoi procedere? 1)massimo di 2 numeri 2)minimo di 2 numeri 3)radice quadrata di un numero 4)quadrato di un numero?");
                    scelta = inputN.nextInt();
                }
            }
        }

        System.out.println("Sono state esseguite " + contatore[0] + " operazioni con il massimo, " + contatore[1] + " operazioni con il minimo, " + contatore[2] + " operazioni con la radice quadrata, " + contatore[3] + " operazioni con il quadrato");

        inputN.close();
        inputB.close();
    }
}