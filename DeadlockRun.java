public class DeadlockRun {

    public void runDeadlock() {

        Deadlock deadlock = new Deadlock();
 

    Thread t1 = new Thread(new Runnable() {

        public void run() {
            deadlock.firstLock();
			 try {
            			Thread.sleep(100);
       			 } catch (InterruptedException e) {
            			System.out.println(e.getMessage());
        		}        
		}
    });

    t1.start();

    Thread t2 = new Thread(new Runnable() {
        
	public void run() {
            deadlock.secondLock();
			 try {
           			 Thread.sleep(100);
        		} catch (InterruptedException e) {
            			System.out.println(e.getMessage());
       			 }
        }
    });

    t2.start();
}

	

}
