public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinhaThread mT1 = new MinhaThread(1);
		MinhaThread mT2 = new MinhaThread(2);
		MinhaThread mT3 = new MinhaThread(3);
		mT1.start();
		mT2.start();
		mT3.start();

	}

}

class MinhaThread extends Thread {
	public static volatile int somaThread=0;
	int numThread = 0;
	MinhaThread(int num){
		this.numThread = num;
	}
	public void run() {
		for(int i = 0; i <= 5; i++) {
			System.out.println("contador thread: " + numThread + ": " + somaThread);
			somaThread++;
		}
	}
}
