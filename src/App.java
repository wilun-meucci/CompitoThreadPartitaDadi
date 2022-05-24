public class App {
    public static void main(String[] args) throws Exception {
        Giocatore g1 = new Giocatore("Dawid");
        Giocatore g2 = new Giocatore("Wlady");
        System.out.println("Inizio della Partita");
        g2.setPriority(10);
        g1.start();
        g2.start();
        System.out.println(g1.getTotale()); //boh non stampa il totale
        System.out.println(g2.getTotale());

        if (g1.getTotale()> g2.getTotale())
        {
            System.out.println("Giocatore "+ g1.getNome() + " ha vinto il gioco");
        }
        else if(g1.getTotale()<g2.getTotale())
        {
            System.out.println("Giocatore "+ g2.getNome() + " ha vinto il gioco");
        } 
        else{
            System.out.println("Parita?");
        }


    }
}
