package ua.univer.task.ifelse;

public class Program9 {
	public static int positive (int x) {
		int counter ;
		int count = 0;
		if (x>0) counter = ++count;
		else counter = count;
		return counter;
		
	}

	public static void main(String[] args) {
		int a = -3;
		int b = -3;
		int c = 5;
		int positiveNumbers = positive (b) + positive (a) + positive(c);
		System.out.println(positiveNumbers);

	}

}
