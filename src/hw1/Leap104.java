package hw1;

import java.util.Scanner;

public class Leap104 {
public static void main(String[] args){
		
		System.setProperty("console.encoding","cp866");	
		System.out.print("Введи год\n");				//Прошу ввести год, подразумевается григорианский календарь
		Scanner first = new Scanner(System.in); 
		int year = first.nextInt();
		
		if (year%4==0 && year%100 !=0 || year%400==0){
			System.out.println("Этот год високосный!");
		}
		else {
			System.out.println("Этот год не високосный!");
			}
		first.close();
		}
}
