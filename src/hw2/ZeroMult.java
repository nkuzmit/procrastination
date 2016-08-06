package hw2;

public class ZeroMult {
public static void main(String[] args) {
		
		int[] f = {1,4,6,8,9,0,5,3,0,7};
		
		int mult = 1;  //To not get a 0 result we musn't initiate int mult = 0;
		for(int x = 0; x < f.length & f[x] != 0; x++){	
			mult *= f[x];
				
}
		System.out.printf("Произведение элементов массива до первого 0 равна %d", mult);
}
}

