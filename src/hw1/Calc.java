package hw1;
import java.util.Scanner;
/**
 * 
 * @author Mikita_Kuzmitski
 * This class is a console calculator which is able do divide and add number given via input
 */
public class Calc {
/**
 * 	
 * @throws java.io.IOException
 */
	public static void main(String args[])
		throws java.io.IOException {
/**
 * The number are acquired using util.Scanner
 * and, since, there is an operation of division
 * I've made the type double 				
 */
		System.setProperty("console.encoding","cp866");				//На всякий случай задаю кодировку
		System.out.print("Введи первое число\n");					//Прошу ввести первое из чисел
		Scanner first = new Scanner(System.in); 
		double x = first.nextInt();
/**
 * Operator Do-While is used to navigate through the menu		
 */
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
/**
 * Operator Switch-Case is used to determine our choices
 * it might be useful if I decide to teach this calculator other operations
 * besides devision and adding		
 */
		switch(choice) {
/**
 * It must be stated that by the logic of arithmetics 
 * devision by zero is impossible		
 */
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
/**
 * I use another Scanner to put together an exit,
 * thought it is a rough and crooked construction I use
 */
		System.out.print("Для выхода введите q\n");					//Тут, если повезет можно выйти нажав на q
		Scanner third = new Scanner(System.in); 
		String q = third.next();
			if (q.compareToIgnoreCase("q") == 0){
				System.exit(0);
			}else{System.out.println("Теперь ты застрял тут НАВЕЧНО!");
					}
/**
 * Scanner will naturally ask for closure
 */
		first.close();
		second.close();
		third.close();

	}
	
}


