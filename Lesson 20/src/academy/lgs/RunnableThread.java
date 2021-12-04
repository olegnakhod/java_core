package academy.lgs;

import java.util.ArrayList;

public class RunnableThread implements Runnable {
	private final int DELAY = 10;
	private int maxValue;
	private int numbersFibonacci;
	private int numbersFibonacciReverse;
//	private Thread thread;
	private ArrayList<Integer> list;

	public RunnableThread(int maxValue) {
		this.maxValue = maxValue;
//		this.thread = new Thread(this);
		this.list = new ArrayList();
//		thread.start();
	}

	public int getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}

	public int getNumbersFibonacci() {
		return numbersFibonacci;
	}

	public void setNumbersFibonacci(int numbersFibonacci) {
		this.numbersFibonacci = numbersFibonacci;
	}

	@Override
	public synchronized void run() {
		int a = 0;
		int b = 1;
		for (int i = 0; i <= getMaxValue(); i++) {
			numbersFibonacci = a + b;
			a = b;
			b = numbersFibonacci;
			if (i == getMaxValue()) {
				int c = a;
				int d = b;
				for (int j = getMaxValue(); j > 0; j--) {
					numbersFibonacciReverse = c;
					c = d - c;
					d = numbersFibonacciReverse;
					list.add(numbersFibonacciReverse);
					try {
						Thread.sleep(DELAY);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
			}

		}
		System.out.println("Потік Runnable: " + list);
	}

}
