package hw1;

import java.util.Scanner;

public class Rur106 {

public static void main(String[] args){
		
		System.setProperty("console.encoding","cp866");	//На всякий случай задаю кодировку
		System.out.print("Введи количество денюшек от 1 до 999\n");					
		Scanner first = new Scanner(System.in); 
		String x = first.next();						//X будет строкой, чтобы считать последние символы
				
		/*Задаю поиски всех 
		 *окончаний чисел которые 
		 *будут отличаться при 
		 *одинаковой последней цифре
		 */
		boolean is1Ending = x.endsWith("1");			
		boolean is2Ending = x.endsWith("2");
		boolean is3Ending = x.endsWith("3");
		boolean is4Ending = x.endsWith("4");
		boolean is11Ending = x.endsWith("11");
		boolean is12Ending = x.endsWith("12");
		boolean is13Ending = x.endsWith("13");
		boolean is14Ending = x.endsWith("14");
		
		/*Проверяю все окончания
		 * перебором с помощью
		 * условного оператора
		 * if-else
		 */
		if (is11Ending == true){
			System.out.println(x + " рублей");
		}
		else if (is12Ending == true){
			System.out.println(x + " рублей");
		}
		else if (is13Ending == true){
			System.out.println(x + " рублей");
		}
		else if (is14Ending == true){
			System.out.println(x + " рублей");
		}
		else if (is1Ending == true){
			System.out.println(x + " рубль");
		}
		else if (is2Ending == true){
			System.out.println(x + " рубля");
		}
		else if (is3Ending == true){
			System.out.println(x + " рубля");
		}
		else if (is4Ending == true){
			System.out.println(x + " рубля");
		} 
		else {
			System.out.println(x + " рублей");
		first.close();
		}
}
}