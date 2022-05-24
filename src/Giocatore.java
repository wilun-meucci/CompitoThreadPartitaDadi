public class Giocatore extends Thread{
    private String nome;
    private int totale =0;
    

    public Giocatore(String nome) {this.nome = nome;}

    
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public int lancioDati()
    {
        return (int)(Math.random()*7);
    }


    


    public int getTotale() {
        return totale;
    }


    public void setTotale(int lancio1,int lancio2) {
        this.totale = lancio1+lancio2;
    }


    @Override
    public void run() {
        System.out.println("Il giocatore: "+getNome() + " entra nella partita");
        
        
        try {
            Thread.sleep(1000);
            
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        int lancio1;
        int lancio2;
        
        do{
            lancio1 = lancioDati();
            
           
        }while(lancio1==0);

        do{
            lancio2 = lancioDati(); //fixxxare solo un lancio 
            
        }while(lancio2==0);
        System.out.println("\nIl giocatore " + getNome()+" ha ottenuto come risultato dal Dado 1 "+ "'"+lancio1+ "'"+" e dal Dado 2 " + "'"+lancio2 + "'");
        do{
            
             this.setTotale(lancio1,lancio2);
            if (lancio1==lancio2)
            {
                System.out.println("\n!!!!!!Lancio bonus di "+ getNome()+"!!!!!!");
                lancio1 = lancioDati();
                lancio2 = lancioDati(); 
                System.out.println("Il giocatore " + getNome()+" ha ottenuto come risultato dal tiro bonus nel Dado 1 "+ "'"+lancio1+ "'"+" e nel Dado 2 " + "'"+lancio2 + "'");
            }
        }
        while(lancio1==lancio2);
        try {
            Thread.sleep(1500);
            
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("------Punteggio totale di "+ getNome()+ " è di "+ getTotale()+"---------");
        try {
            Thread.sleep(500);
            
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Il giocatore "+getNome()+" ha terminato la partita");
        

    }
    
}
