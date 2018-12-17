public class Deadlock { // ZAKLESZCZENIE -  dwie różne akcje czekają na siebie nawzajem, więc żadna nie może się zakończyć


    private Object lock1 = new Object();
    private Object lock2 = new Object();
 
    public void firstLock() {
        synchronized (lock1) {
            synchronized (lock2) {
                System.out.println("Pierwszy wątek czeka, aż drugi zakończy pracę");
            }
        }
    }
 
    public void secondLock() {
        synchronized (lock2) {
            synchronized (lock1) {
                System.out.println("Drugi wątek czeka, aż pierwszy zakończy pracę");
            }
        }
    }
}
