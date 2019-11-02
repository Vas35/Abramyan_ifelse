package ua.univer.task.ifelse;

public class Program3 {

	public static void main(String[] args) {
		int a =4;
		int b = 9;
		int c = -4;
		int d = 4;
		int e = 0;
		 int min = numMin(numMin(numMin(numMin(a,b),c),d),e);
		System.out.println(min);
		int max = numMax(numMax(numMax(numMax(a,b),c),d),e);
		System.out.println(max );
		int maxMethod = Math.max(Math.max(Math.max(Math.max(a,b),c),d),e);
		System.out.println("Библиотека = " + maxMethod);
	}

	public static int numMin(int x, int y) {
	if (x<y) return x;
	else return y;
		
	}

	public static int numMax(int x, int y) {
	if (x<y) return y;
	else return x;
		
	}
}
