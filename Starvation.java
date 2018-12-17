public class Starvation { // Jakiś watek trzyma pewien zasób tak długo, że inne wątki zablokowane są w nieskończoność i they starve to death
 
    public synchronized void runStarvation() {
        String name = Thread.currentThread().getName();

        while (true) {
            System.out.println("Pracuje wątek : " + name);
			
        }
    }
}
