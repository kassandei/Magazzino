import java.util.Random;
import java.util.random.*;

public class AggiungiProdottiThread extends Thread {
    private int q;
    Magazzino magazzino;
    public AggiungiProdottiThread(Magazzino magazzino) {
        this.magazzino = magazzino;
    }

    @Override
    public void run() {
        while(true)
        {
            q = new Random().nextInt(magazzino.capienza);
            System.out.println("provo ad aggiungere> "+q);
            while(!magazzino.addProdotto(q));
            System.out.println("aggiunto");
            try {
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
