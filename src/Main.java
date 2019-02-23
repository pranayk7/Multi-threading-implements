
public class Main {
	public static void main(String args[]) {
		Alphabet alphabet = new Alphabet();
		Digit digit = new Digit();
		
		Thread t1 = new Thread(alphabet);
		Thread t2 = new Thread(digit);
		
		t1.start();
		t2.start();
	}
}
