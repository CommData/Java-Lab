//WAP to implement the concept of Multi-threading using:
// (a) Runnable Interface
// (b) Thread Class

// (a) ---------------------------Runnable Interface------------------//

class MultithreadingDemo0 implements Runnable {
	public void run()
	{
		try {
			System.out.println("Thread is running Runnable Class "+Thread.currentThread().getId());
		}
		catch (Exception e) {
			System.out.println("Exception is caught Runnable Class");
		}
	}
}

// (b) ----------------- Thread Class -----------------------------------//

class MultithreadingDemo extends Thread {
	public void run()
	{
		try {
			System.out.println(
				"Thread is running Thread Class "+Thread.currentThread().getId());
		}
		catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}
}

public class ExpSix {
	public static void main(String[] args)
	{
		int n = 8; // Number of threads
		for (int i = 0; i < n; i++) {
			MultithreadingDemo object
				= new MultithreadingDemo();
			object.start();
		}
		for (int j = 0; j < n; j++) {
			Thread object0 = new Thread(new MultithreadingDemo0());
			object0.start();
		}
	}
}
