class Main {
	public static void main(String[] args) {

		String wybor = args[0];

		try {
		switch (wybor) {
			

			case "d": 
				System.out.println("DEADLOCK\n");
				DeadlockRun deadlockRun = new DeadlockRun();
				deadlockRun.runDeadlock();
			break;


			case "l":
				System.out.println("LIVELOCK\n");
				LivelockRun livelockRun = new LivelockRun();
				livelockRun.runLivelock();
			break;

			case "s":
				System.out.println("STARVTION\n");
				StarvationRun starvationRun = new StarvationRun();
				starvationRun.runStarvation();
			
			break;
			
			default:
		       	 	System.out.println("ZŁA OPCJA :( ");
		        break;
		}


		}
		catch(NumberFormatException e) {
			e.printStackTrace();
			System.out.println("Podano niepoprawna wartosc opcji.");
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Wystapil inny blad.");
		}

		double startTime = System.currentTimeMillis();

		while(true) {
			if(System.currentTimeMillis() - 5000 > startTime) {
				System.exit(0);	
			}
		}
	}
}

