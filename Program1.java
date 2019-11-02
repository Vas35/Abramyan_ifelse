package ua.univer.task.ifelse;

public class Program1 {

	public static void main(String[] args) {
		int a,b,c,d;
		a=4;
		b=7;
		c=-4;
		d=1;
		if (a<b && a<c && a<d) {
		System.out.println("Наименьшее число = " + a);
		}
		else if (b<a && b<c && b<d) {
			System.out.println("Наименьшее число = " + b);
			}
		else if (c<b && c<a && c<d) {
			System.out.println("Наименьшее число = " + c);
			}
		else if (d<b && d<c && d<a) {
			System.out.println("Наименьшее число = " + d);
			}
		else {
			System.out.println("все числа одинаковые");
		}
	
	}

}
