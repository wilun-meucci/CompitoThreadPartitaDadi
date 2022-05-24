public class App {
    public static void main(String[] args) throws Exception {
        Giocatore g1 = new Giocatore("Dawid");
        Giocatore g2 = new Giocatore("Wlady");
        System.out.println("Inizio della Partita");
        g2.setPriority(10);
        g1.start();
        
        g2.start();
    }
}
