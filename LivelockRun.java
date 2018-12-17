public class LivelockRun { //Występuje gdy obydwa procesy aby uniknąć deadlock’a zatrzymują wykonywanie kodu aby dać szansę innym wątkom na wykonanie się. by ułatwić zrozumienie tego, wyobraźmy sobie sytuację gdy dwie osoby na korytarzu aby minąć siebie wybierają ciągle tą samą trasę, kończąc na ciągłej wzajemnej blokadzie. Livelock może wydawać się podobny do deadlock (rezultat jest taki sam). W przypadku Livelock stan procesu się jednak zmienia.


    static final Livelock firstlock = new Livelock();
 
    static final Livelock secondlock = new Livelock();
 
    public static void runLivelock() {
 
 
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                firstlock.firstLockRun(secondlock);
            }
        });
        t1.start();
 
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                secondlock.secondLockRun(firstlock);
            }
        });
        t2.start();
    }
 
}
