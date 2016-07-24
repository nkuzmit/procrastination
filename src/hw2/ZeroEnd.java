package hw2;

public class ZeroEnd {
public static void main(String[] args) {
		
		int[] f = {1,0,6,8,0,0,5,3,8,7};
		int x = 0;
		int[] result = new int[f.length];
		
		for (int i = 0; i < f.length; i++) {
            if (f[i] != 0)
                result[x++] = f[i];
		}
		for (int i = 0; i < f.length; i++) {
            if (f[i] == 0)
                result[x++] = f[i];
}
		System.out.println("Новый массив:");
        for (int i = 0; i < result.length; i++)
            System.out.printf("%-4d", result[i]);
}
}