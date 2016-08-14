package hw13;

import java.util.Scanner;

public class ThreadTry extends Thread {
	public static void main(String[] args) throws InterruptedException {

		ThreadTry t1 = new ThreadTry();
		ThreadTry t2 = new ThreadTry();

		t1.setName("Thread 1: ");
		t2.setName("Thread 2: ");

		System.out.println("Type \"start\" to begin, or \"exit\" to leave");

		String command;
		Scanner com = new Scanner(System.in);
		command = com.nextLine();

		switch (command) {
		case ("start"):
			t1.start();
			t2.start();
			break;
		case ("exit"):
			System.out.println("Bye-Bye");
			System.exit(0);
		default:
			break;
		}
		com.close();
	}

	public void run() {
		int i;
		StringBuffer sb = new StringBuffer();
		sb = sb.append(ThreadTry.currentThread().getName());
		for (i = 1; i <= 100; i++) {
			sb = sb.append(" " + i);
			if (i % 10 == 0) {
				System.out.println(sb);
				sb = new StringBuffer();
				sb = sb.append(ThreadTry.currentThread().getName());
			}
		}

	}
}