package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		
		Calculator obj=new Calculator();
		System.out.println(obj.add(1,2,3));
		System.out.println(obj.sub(4,2));
		System.out.println(obj.mul(2,3));
		System.out.println(obj.divide(6,3));
	}
}
