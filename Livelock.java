public class Livelock {
    private boolean firstActionMade = false;
	private boolean secondActionMade = false;
 
    public void firstLockRun(Livelock secondlock) {
 
        while (!secondlock.secondAction()) {
 
            System.out.println("Drugi watek czeka, aż pierwszy wykona działanie");
 
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
 
        System.out.println("Pierwszy watek wykonal dzialanie, wiec drugi moze zaczac dzialac");
 
        this.firstActionMade = true;
    }
 
    public boolean firstAction() {
        return this.firstActionMade;
    }
 
	 public void secondLockRun(Livelock firstlock) {
        while (!firstlock.firstAction()) {
 
            System.out.println("Pierwszy watek czeka, aż drugi wykona działanie");
 
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
 
        System.out.println("Drugi watek wykonal dzialanie, wiec pierwszy moze zaczac dzialac");
 
        this.secondActionMade = true;
    }
 
    public boolean secondAction() {
        return this.secondActionMade;
    }
}
