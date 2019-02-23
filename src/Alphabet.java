
public class Alphabet implements Runnable{
	
	public void run() {
		char alphabet = 'a';
		for (int i=1; i<=5; i++) {
			System.out.println(alphabet++);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
