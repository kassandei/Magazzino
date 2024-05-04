import java.util.Random;

public class RimuoviProdottiThread extends Thread {
    private Random random;
    Magazzino magazzino;
    public RimuoviProdottiThread(Magazzino magazzino) {
        this.magazzino = magazzino;
        this.random = new Random();
    }

    @Override
    public void run() {
        while (true) {
            int quantita = random.nextInt(5) + 1; // Genera un numero casuale da 1 a 5
            try {
                magazzino.removeProdotto(quantita);
                System.out.println("Rimossi " + quantita + " prodotti dal magazzino.");
                Thread.sleep(1500); // Attendiamo 1.5 secondi prima di rimuovere nuovi prodotti
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

