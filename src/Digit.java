
public class Digit implements Runnable {
	
	public void run() {
		int digit = 1;
		for (int i=1; i<=5; i++) {
			System.out.println(digit++);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
