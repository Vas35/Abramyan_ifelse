package ua.univer.task.ifelse;

public class Program7 {

	public static void main(String[] args) {
		int a =-11;
		int newNumber = plusAndSubtract(a);
		System.out.println(newNumber);

	}

	public static int plusAndSubtract (int x) {
		int number;
		if (x>0) number = ++x;
		else number = x + 2;
		return number;
		
	}
}
