package hw2;

public class Zero {
public static void main(String[] args) {
		
		int[] f = {1,4,6,8,9,0,5,3,8,7};
		
		int sum = 0;
		for(int x = 0; x < f.length & f[x] != 0; x++){	
			sum += f[x];
				
}
		System.out.printf("Сумма элементов массива до первого 0 равна %d", sum);
}
}