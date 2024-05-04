public class StampaNumProdottiThread extends Thread {
    Magazzino magazzino;
    public StampaNumProdottiThread(Magazzino magazzino) {
        this.magazzino = magazzino;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Numero attuale di prodotti nel magazzino: " + magazzino.getNumProdotti());
            try {
                Thread.sleep(2000); // Stampiamo il numero di prodotti ogni 2 secondi
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
