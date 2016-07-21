package hw1;
import java.util.Scanner;
//использования цикла do-while для выбора пункта меню
class Calc {
	public static void main(String args[])
		throws java.io.IOException {
		
		//System.exit(0);
		
		System.setProperty("console.encoding","cp866");				//На всякий случай задаю кодировку
		System.out.print("Введи первое число\n");					//Прошу ввести первое из чисел
		Scanner first = new Scanner(System.in); 
		double x = first.nextInt();
		
		char choice;
		do {														//Использую Do-While для выбора пунктов меню
			System.out.println("Выбери действие: ");
			System.out.println("1. Деление");
			System.out.println("2. Сложение");
			choice = (char) System.in.read();
		} while( choice < '1' || choice > '2');
		
		System.out.print("Введи второе число\n");					//Прошу ввести второе число
		Scanner second = new Scanner(System.in); 
		double y = second.nextInt();
		
		switch(choice) {
			case '1':
				if (y != 0){
					System.out.println("Ответ : " + x / y);
				}else System.out.println("0 - неверное значение делителя");
				break;
			case '2':
				double z = x + y;
				System.out.println("Ответ : " + z);
				break;		
					}
		System.out.print("Для выхода введите q\n");					//Тут, если повезет можно выйти нажав на q
		Scanner third = new Scanner(System.in); 
		String q = third.next();
			if (q.compareToIgnoreCase("q") == 0){
				System.exit(0);
			}else{System.out.println("Теперь ты застрял тут НАВЕЧНО!");
					}
		first.close();
		second.close();
		third.close();
	}
	
}


