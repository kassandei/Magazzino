import java.lang.Math;
import java.util.Random;

public class RimuoviProdottiThread extends Thread {
    private int q;
    Magazzino magazzino;
    public RimuoviProdottiThread(Magazzino magazzino) {
        this.magazzino = magazzino;
    }

    @Override
    public void run() {
        while(true)
        {
            q = new Random().nextInt(magazzino.getNumProdotti());
            System.out.println("provo ad rimuovere> "+q);
            while(!magazzino.removeProdotto(q));
            System.out.println("rimosso");

            try {
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

