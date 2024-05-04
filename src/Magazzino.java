public class Magazzino {
    private Object[] prodotto;
    public final int capienza;
    private int contatore;
    public Magazzino(int capienza) {
        this.capienza = capienza;
        prodotto = new Object[capienza];
        contatore = 0;
    }

    public boolean addProdotto(int quantita) {
        if(contatore + quantita > capienza) return false;

        for(int i = contatore; i < contatore+quantita; i++)
            prodotto[i] = new String("Prodotto n^: " + i);


        contatore += quantita;
        return true;
    }

    boolean removeProdotto(int quantita) {
        if (quantita > contatore) return false;

        for(int i = contatore; i > contatore - quantita ; i--)
            prodotto[i] = null;

        contatore -= quantita;
        return true;
    }

    public int getNumProdotti() {
        return contatore;
    }

    @Override
    public String toString() {
        return "Capienza: " + capienza + ", Prodotti = " + contatore;
    }
}
