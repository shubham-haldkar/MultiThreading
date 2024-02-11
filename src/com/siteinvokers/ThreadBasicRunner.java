package com.siteinvokers;

// Thread using extends Thread
class Task1 extends Thread {
	public void run() { // It matches the exact signature
		System.out.println("\nTask 1 started ");
		for (int i = 1; i < 50; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask 1 done ");
	}
}

// Implementing runnable interface
class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("\nTask 2 started ");
		for (int i = 101; i < 150; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask 2 done ");

	}

}

public class ThreadBasicRunner {

	public static void main(String[] args) {
		// Task 1
		Task1 task1 = new Task1();
		task1.start(); // starting the task1

		// Task 2
		Task2 task2 = new Task2();
		Thread task2thread = new Thread(task2);
		task2thread.start();

		// Task 3
		System.out.println("\nTask 3 started ");
		for (int i = 201; i < 250; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask 3 done ");

		System.out.println(" main done ");
	}

}
