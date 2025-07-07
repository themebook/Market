package ezen.market.console;

import java.util.Scanner;

public class MainConsole extends Thread {
	Scanner sc = new Scanner(System.in);

	@Override
	public void run() {
		while (true) {
			System.out.println("> ");
			sc.nextLine();
		}
	}
}
