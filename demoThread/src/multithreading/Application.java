package multithreading;

class StartThreads implements Runnable{
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println("Hi There : " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Application {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new StartThreads());
		Thread thread2 = new Thread(new StartThreads());

		thread1.start();
		thread2.start();
		
	}

}
