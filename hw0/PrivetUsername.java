import java.util.Scanner;

public class PrivetUsername {
	
	public static void main(String[] args) {
	
		System.out.print("��� ���� �����?\n");
		Scanner greeting = new Scanner(System.in);
		String userName = greeting.next();
		System.out.print("������, " + userName + "!");
	}
}

		