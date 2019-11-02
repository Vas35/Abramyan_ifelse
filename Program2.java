package ua.univer.task.ifelse;

public class Program2 {
	public static int findMax(int x, int y ) {
		int mymax;
			if (x < y) mymax = y;
			else mymax = x;
			return mymax;
	}
		
	public static void main(String[] args) {
		int a,b,c,d;
		a=9;
		b=9;
		c=9;
		d=9;
		
		int mymax = findMax (findMax(findMax(a,b),c),d); 
		
			System.out.println("Максимальное число = " + mymax);
			int count = countMax(a, b, c, d, mymax);
		System.out.println("Количество максимальных чисел " + count);

	}

	private static int countMax(int a, int b, int c, int d, int mymax) {
		int count = 0;
		if (mymax == a ) { 
			count ++;
		}
		if (mymax == b ) { 
			count ++;
		}
		if (mymax == c ) { 
			count ++;
		}
		if (mymax == d ) { 
			count ++;
		}
		return count;
	}

}
