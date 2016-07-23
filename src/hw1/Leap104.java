package hw1;

import java.util.Scanner;

public class Leap104 {
public static void main(String[] args){
		
		System.setProperty("console.encoding","cp866");	//Ќа вс€кий случай задаю кодировку
		System.out.print("¬веди год\n");				//ѕрошу ввести год, подразумеваетс€ григорианский календарь
		Scanner first = new Scanner(System.in); 
		int year = first.nextInt();
		
		if (year % 4 != 0){								//ѕровер€ю делением на 4, возможно сразу определю не високосный
			System.out.println("Ётот год не високосный!");
		}
		else {
			if(year % 100 == 0 && year % 400 ==0){						//≈сли дошел сюда, провер€ю делением на 100 и 400
				System.out.println("Ётот год високосный!");
			}
		}
		first.close();
	}
}