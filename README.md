## Semplice esercitazione sui thread
Obiettivo:
Implementare un sistema di gestione di un magazzino utilizzando concetti di programmazione multithread.

Descrizione:
Si desidera creare un'applicazione per gestire un magazzino di prodotti. Il magazzino ha una capacità massima di prodotti che può contenere e offre le seguenti operazioni:Aggiunta di prodotti al magazzino.Rimozione di prodotti dal magazzino.Visualizzazione del numero attuale di prodotti nel magazzino.

Il sistema deve essere implementato utilizzando Java e la concorrenza deve essere gestita utilizzando i thread.

Requisiti:Creare una classe Magazzino che rappresenti il magazzino. Questa classe dovrebbe avere i seguenti metodi:
- **addProdotto(int quantita):** Aggiunge una determinata quantità di prodotti al magazzino. Se l'aggiunta supera la capacità massima del magazzino, il metodo deve attendere finché non ci sono abbastanza spazi disponibili.
- **removeProdotto(int quantita):** Rimuove una determinata quantità di prodotti dal magazzino. Se la quantità da rimuovere supera la quantità attuale di prodotti nel magazzino, il metodo deve attendere finché non ci sono abbastanza prodotti disponibili.
- **getNumProdotti():** Restituisce il numero attuale di prodotti nel magazzino.

Creare una classe AggiungiProdottiThread che estenda Thread. 
- Questa classe dovrebbe rappresentare un thread che aggiunge prodotti al magazzino in modo casuale. Il numero di prodotti da aggiungere dovrebbe essere generato casualmente.
Creare una classe RimuoviProdottiThread che estenda Thread.
- Questa classe dovrebbe rappresentare un thread che rimuove prodotti dal magazzino in modo casuale. Il numero di prodotti da rimuovere dovrebbe essere generato casualmente.
Creare una classe StampaNumProdottiThread che estenda Thread.
- Questa classe dovrebbe rappresentare un thread che stampa il numero attuale di prodotti nel magazzino a intervalli regolari.

Nella classe Main, creare un'istanza di Magazzino con una capacità massima di prodotti. Successivamente, creare istanze di AggiungiProdottiThread, RimuoviProdottiThread, e StampaNumProdottiThread, passando il magazzino creato come parametro.
Avviare i thread creati nella classe Main.
