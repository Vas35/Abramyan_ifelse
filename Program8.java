package ua.univer.task.ifelse;

public class Program8 {

	public static void main(String[] args) {
		int a =10;
		int newNumber = plusAndSubtractOrZero(a);
		System.out.println(newNumber);

	}

	public static int plusAndSubtractOrZero (int x) {
		int number;
		if (x>0) number = ++x;
		else if(x<0) number = x + 2;
		else number = 10;
		return number;
		
	}
}