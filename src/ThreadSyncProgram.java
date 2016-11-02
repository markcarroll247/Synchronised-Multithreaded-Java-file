
public class ThreadSyncProgram {
	

	public static void main(String[] args) {
		LaunchCountdown c = new LaunchCountdown();
		
		LaunchShuttle L1 = new LaunchShuttle( "Launch Thread 1 ", c);
		LaunchShuttle L2 = new LaunchShuttle( "Launch Thread 2 ", c);
		LaunchShuttle L3 = new LaunchShuttle( "Launch Thread 3 ", c);
		LaunchShuttle L4 = new LaunchShuttle( "Launch Thread 4 ", c);
		LaunchShuttle L5 = new LaunchShuttle( "Launch Thread 5 ", c);
		LaunchShuttle L6 = new LaunchShuttle( "Launch Thread 6 ", c);
		LaunchShuttle L7 = new LaunchShuttle( "Launch Thread 7 ", c);
		LaunchShuttle L8 = new LaunchShuttle( "Launch Thread 8 ", c);
		LaunchShuttle L9 = new LaunchShuttle( "Launch Thread 9 ", c);
		LaunchShuttle L10 = new LaunchShuttle( "Launch Thread 10 ", c);
		
		
		try{
			L1.start();
			L2.start();
			L3.start();
			L4.start();
			L5.start();
			L6.start();
			L7.start();
			L8.start();
			L9.start();
			L10.start();
			
		}catch(Exception e){
			System.out.println("Thread interrupted");
		}

		
	}

}
