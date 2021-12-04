package academy.lgs;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Aplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть довжину рядка Фібоначчі:");
		int value = sc.nextInt();

		MyThread thread = new MyThread(value);
		thread.start();
		RunnableThread runnable = new RunnableThread(value);
		Thread threadTwo = new Thread(runnable);
		threadTwo.start();

		// SingleThreadExecutor
		ExecutorService executorOne = Executors.newSingleThreadExecutor();
		executorOne.execute(new RunnableThread(value));
		executorOne.execute(new MyThread(value));
		executorOne.shutdown();

		//FixedThreadPool
		ExecutorService executorTwo = Executors.newFixedThreadPool(2);
		executorTwo.execute(new MyThread(value));
		executorTwo.execute(new RunnableThread(value));
		executorTwo.shutdown();
		
		//CachedThreadPool
		ExecutorService executorThree = Executors.newCachedThreadPool();
		executorThree.execute(new MyThread(value));
		executorThree.execute(new RunnableThread(value));
		executorThree.shutdown();
		
		//ScheduledThreadPool
		ExecutorService executorFour = Executors.newScheduledThreadPool(2);
		executorFour.execute(new MyThread(value));
		executorFour.execute(new RunnableThread(value));
		executorFour.shutdown();
	}

}
