package hw1;

import java.util.Scanner;

public class Leap104 {
public static void main(String[] args){
		
		System.setProperty("console.encoding","cp866");	//На всякий случай задаю кодировку
		System.out.print("Введи год\n");				//Прошу ввести год, подразумевается григорианский календарь
		Scanner first = new Scanner(System.in); 
		int year = first.nextInt();
		
		if (year % 4 != 0){								//Проверяю делением на 4, возможно сразу определю не високосный
			System.out.println("Этот год не високосный!");
		}
		else {
			if(year % 100 == 0 && year % 400 ==0){		//Если дошел сюда, проверяю делением на 100 и 400
				System.out.println("Этот год високосный!");
			}
		}
		first.close();
	}
}