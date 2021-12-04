package academy.lgs;

import java.util.ArrayList;

public class MyThread extends Thread {

	private final int DELAY = 10;
	private int maxValue;
	private int numbersFibonacci;
	private ArrayList<Integer> list;

	public MyThread(int maxValue) {
		this.maxValue = maxValue;
		this.list = new ArrayList();
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
	public void run() {
		int a = 0;
		int b = 1;
		for (int i = 0; i < getMaxValue(); i++) {
			numbersFibonacci = a + b;
			a = b;
			b = numbersFibonacci;
			list.add(numbersFibonacci);
			try {
				Thread.sleep(DELAY);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Потік Thread: " + list);

	}

}
