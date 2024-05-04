import java.util.Random;

public class StampaNumProdottiThread extends Thread {
    Magazzino magazzino;
    public StampaNumProdottiThread(Magazzino magazzino) {
        this.magazzino = magazzino;
    }

    @Override
    public void run() {
        while(true) {
            System.out.println(magazzino);
            try {
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
