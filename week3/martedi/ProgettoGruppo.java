package week3.martedi;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgettoGruppo {
    public static void main(String[] args) {
        Scanner scannerS = new Scanner(System.in);
        Scanner scannerN = new Scanner(System.in);

        Negozio negozio = new Negozio();
        boolean continua = true;
        int scelta;

        while (continua) {
            menu();
            scelta = scannerN.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println("Quanti clienti vuoi inserire?");
                    int numeroClienti = scannerN.nextInt();

                    for (int i = 0; i < numeroClienti; i++) {
                        System.out.println("Inserire il nome:");
                        String nomeAggiungi = scannerS.nextLine();

                        System.out.println("Inserire l'ID:");
                        String idAggiungi = scannerS.nextLine();

                        Cliente cliente = new Cliente(idAggiungi, nomeAggiungi);
                        negozio.aggiungiCliente(cliente);
                    }

                    System.out.println("Lista dei clienti registrati:");
                    for(Cliente cliente : negozio.listaClienti){
                        System.out.println("Nome: " + cliente.nome + " id: " + cliente.id);
                    }
                    break;
            
                case 2:
                    System.out.println("Quanti dolci vuoi inserire?:");
                    int numeroDolci = scannerN.nextInt();

                    for (int i = 0; i < numeroDolci; i++) {
                        System.out.print("Inserisci il nome del dolce:");
                        String nomeDolceAggiungi = scannerS.nextLine();

                        System.out.print("Inserisci il prezzo del dolce:");
                        double prezzoAggiungi = scannerN.nextDouble();

                        Dolce dolce = new Dolce(nomeDolceAggiungi, prezzoAggiungi);
                        negozio.aggiungiDolce(dolce);
                    }

                    System.out.println("Lista dei dolci disponibili: ");
                    for (Dolce dolce : negozio.dolciDisponibili) {
                        System.out.println("Nome: " + dolce.nome + "  prezzo: " + dolce.prezzo);
                    }
                    break;
                case 3:
                    System.out.println("Inserisci il nome del dolce:");
                    String nomeDolceRimuovi = scannerS.nextLine();

                    for (Dolce dolce : negozio.dolciDisponibili) {
                        if (dolce.nome.equals(nomeDolceRimuovi)) {
                            negozio.rimuoviDolce(dolce);
                        }
                    }
                case 4:
                    System.out.println("Inserisci l'ID del cliente che vuole effetuare l'acquisto:");
                    String idAcquisto = scannerS.nextLine();
                    System.out.println("Quanti dolci vuole acquistare?");
                    int numeroAcquisto = scannerN.nextInt();
                    double totale = 0;

                    for (int i = 0; i < numeroAcquisto; i++) {
                        System.out.println("Inserisci il nome del dolce da acquistare:");
                        String nomeDolceAcquisto = scannerS.nextLine();
                        for (Dolce dolce : negozio.dolciDisponibili) {
                            if (dolce.nome.equals(nomeDolceAcquisto)) {
                                negozio.gestisciAcquisto(idAcquisto, dolce);
                                totale += dolce.prezzo;
                            }
                        }
                    }

                    System.out.println("Il totale per " + numeroAcquisto + "dolci è: " + totale);
                    break;
                case 5:
                    continua = false;
                    break;
            }
        }

        scannerN.close();
        scannerS.close();
    }

    static void menu() {
        System.out.println("Scegli un'opzione:");
        System.out.println("1. Aggiungi cliente");
        System.out.println("2. Aggiungi dolce");
        System.out.println("3. Rimuovi dolce");
        System.out.println("4. Gestisci acquisto");
        System.out.println("5. Quit");
    }
}

class Dolce {
    String nome;
    double prezzo;

    public Dolce(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }
}

class Cliente {
    String id;
    String nome;
    ArrayList<Dolce> listaDolci;

    public Cliente(String id, String nome) {
        this.id = id;
        this.nome = nome;
        this.listaDolci = new ArrayList<>();
    }

    public void acquistaDolce(Dolce dolce) {
        listaDolci.add(dolce);
        System.out.println("Hai acquistato questo dolce: " + dolce.nome);
    }

    public void elencoAcquisti() {
        System.out.println("Lista dolce acquistati: ");
        for (Dolce dolce : listaDolci) {
            System.out.println("Hai acquistato un " + dolce.nome + " al costo di " + dolce.prezzo);
        }
    }
}

class Negozio {
    ArrayList<Dolce> dolciDisponibili;
    ArrayList<Cliente> listaClienti;

    public Negozio() {
        dolciDisponibili = new ArrayList<>();
        listaClienti = new ArrayList<>();
    }

    public void aggiungiDolce(Dolce dolce) {
        dolciDisponibili.add(dolce);
    }

    public void rimuoviDolce(Dolce dolce) {
        if(dolciDisponibili.contains(dolce)) {
            dolciDisponibili.remove(dolce);
        } else {
            System.out.println("Dolce non trovato");
        }
    }

    public void aggiungiCliente(Cliente cliente){
        listaClienti.add(cliente);
    }

    public void gestisciAcquisto(String id, Dolce dolce){
        boolean trovato = dolciDisponibili.contains(dolce);
        if (trovato) {
            for (Cliente cliente : listaClienti) {
                if (cliente.id.equals(id)) {
                    cliente.acquistaDolce(dolce);
                }
            }
        }
        else {
            System.out.println("Dolce non trovato");
        }
    }
}