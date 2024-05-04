public class Magazzino {
    public final int capienza;
    private int contatore;
    public Magazzino(int capienza) {
        this.capienza = capienza;
        contatore = 0;
    }

    public boolean addProdotto(int quantita) {
        if(contatore + quantita > capienza) return false;
        contatore += quantita;
        return true;
    }

    boolean removeProdotto(int quantita) {
        if (quantita > contatore) return false;
        contatore -= quantita;
        return true;
    }

    public int getNumProdotti() {
        return contatore;
    }

    @Override
    public String toString() {
        return "Prodotti = " + contatore;
    }
}
