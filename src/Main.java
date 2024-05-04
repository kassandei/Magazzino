import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Magazzino abc = new Magazzino(100);
        AggiungiProdottiThread aggiungi = new AggiungiProdottiThread(abc);
        RimuoviProdottiThread rimuovi = new RimuoviProdottiThread(abc);
        StampaNumProdottiThread stampa = new StampaNumProdottiThread(abc);

        stampa.start();
        aggiungi.start();
        rimuovi.start();

    }
}