import java.util.Scanner;

public class PrivetUsername {
	
	public static void main(String[] args) {
	
		System.out.print("Как тебя зовут?\n");
		Scanner greeting = new Scanner(System.in);
		String userName = greeting.next();
		System.out.print("Привет, " + userName + "!");
	}
}

		