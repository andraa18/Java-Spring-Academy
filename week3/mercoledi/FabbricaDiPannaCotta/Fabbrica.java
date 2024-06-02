package week3.mercoledi.FabbricaDiPannaCotta;

import java.util.ArrayList;

public class Fabbrica {
    private ArrayList<PannaCotta> listaPannaCotta;

    public Fabbrica() {
        listaPannaCotta = new ArrayList<>();
    }

    public void aggiungiPannaCotta(PannaCotta pannacotta) {
        listaPannaCotta.add(pannacotta);
    }

    public void visualizzaPannaCotta() {
        for (PannaCotta pannacotta : listaPannaCotta) {
            System.out.println("Nome: " + pannacotta.getNome() + ", Prezzo: " + pannacotta.getPrezzo() + " euro");
        }
    }

    public ArrayList<PannaCotta> getListaPannaCotta() {
        return listaPannaCotta;
    }
}
