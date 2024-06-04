/*Descrizione dell'esercizio

Classe base DispositivoElettronico: Questa classe contiene il metodo avviaApplicazione(String nomeApp) che stampa un messaggio generico riguardante l'avvio dell'applicazione, ogni singola classe deve avere questo metodo per stampare cosa fa.
Classe Smartphone: Fa l'override del metodo avviaApplicazione per includere un comportamento specifico, ovvero il metodo logging con nome e password dell'accesso 
Classe Tablet: Anch'essa fa l'override di avviaApplicazione ma con differenti specificità,  qui si va a specializzare le funzioni di creazione valori del utente Punti (randomico) , Id (a salire pe utente partendo da 1)
Classe ResocontoDigitale. Deve stampare tutte le componenti dell’utente */
package martedi.Esercizio;

public class Utente {
    private String nome = "";
    private String password;
    private int punti;
    private int id;

    public Utente(String nome, String password) {
        this.nome = nome;
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public String getPassword() {
        return password;
    }

    public int getPunti() {
        return punti;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPunti(int punti) {
        this.punti = punti;
    }
}
