package ua.univer.task.ifelse;

public class Program6 {
	public static int plusOne(int x) {
		int number;
		if (x<0)  number = ++x;
		else number = x;
		return number;
	}
	public static void main(String[] args) {
		int a = -5;
		int newNumber = plusOne(a);
	
		
	System.out.println(newNumber);
	}

}
