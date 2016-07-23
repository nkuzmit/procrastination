package hw1;

import java.util.Scanner;

public class Week {
	
public static void main(String[] args){
		
		System.setProperty("console.encoding","cp866");	//На всякий случай задаю кодировку
		System.out.print("Введи порядковый номер дня недели:\n");	//Принимаем день
		Scanner first = new Scanner(System.in); 
		int x = first.nextInt();
		
		String dayName;
		if(x == 1)
			dayName = "Понедельник";
		else if(x == 2)
			dayName = "Вторник";
		else if(x == 3)
			dayName = "Среда";
		else if(x == 4)
			dayName = "Четверг";
		else if(x == 5)
			dayName = "Пятница";
		else if(x == 6)
			dayName = "Суббота";
		else if(x == 7)
			dayName = "Воскресенье";
		else dayName = "У тебя, что? семь пятниц на неделе?";
		System.out.println(dayName);
		first.close();
}	
}
