package hw1;

public class Stroki101 {   
	public static void main(String[] args) {
		String str1 = "Образовательный центр Парка высоких технологий"; //Рандомная строка, с рандомного сайта
		int length = str1.length();										//Вычисляем длину строи
		System.out.println("Длина строки = " + length);					//и выводим на экран				
		int half = length/2;											
				
		String firstHalf = str1.substring(0, length - half);			//Извлекаем подстроку равную первой половине нашей строки
		String secondHalf = str1.substring(half);						//И второй
		System.out.println("Первая половина строки = " + firstHalf);
		System.out.println("Вторая половина строки = " + secondHalf);
	}

}
