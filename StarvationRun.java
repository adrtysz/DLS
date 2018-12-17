public class StarvationRun {
 
    public static void runStarvation() {

        Starvation starvation = new Starvation();
 
		for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                public void run() {
                    starvation.runStarvation();
                }
            }).start();
        }
    }
}
