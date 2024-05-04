import java.util.Random;
public class AggiungiProdottiThread extends Thread {
    private Random random;
    Magazzino magazzino;
    public AggiungiProdottiThread(Magazzino magazzino) {
        this.magazzino = magazzino;
        this.random = new Random();
    }

    @Override
    public void run() {
        while (true) {
            int quantita = random.nextInt(10) + 1; // Genera un numero casuale da 1 a 10
            try {
                magazzino.addProdotto(quantita);
                System.out.println("Aggiunti " + quantita + " prodotti al magazzino.");
                Thread.sleep(1000); // Attendiamo 1 secondo prima di aggiungere nuovi prodotti
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
