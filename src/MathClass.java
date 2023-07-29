
public class MathClass {

	public static void main(String[] args) {
		
		String returnedValue=number(); // returnNumber=5
		System.out.println(returnedValue);

		int sum=add(5,6);
		System.out.println(sum);
		
		System.out.println(add(4.5,6.2));
		System.out.println(add(3.2, 4, 8));
		System.out.println(Math.max(10, 5));
		System.out.println(Math.pow(2, 3));
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Math.random());
		}
		generateNumbers();
		rollDice();
	}
	
	public static String number() {
		return "sdgsgfg";
	}
	
	public static int add(int a,int b) {
		return a+b;
	}
	public static double add(double a, int b, int c) {
		return a+b+c;
	}
	//overloading
	public static double add(double a, double b) {
		return a+b;
	}
	
	public static void generateNumbers() {
		for (int i = 0; i < 20; i++) {
			System.out.println(Math.random()*6);
		}
	}
	
	public static void rollDice() {
		for (int i = 0; i < 5; i++) {
			System.out.println((int)(Math.random()*6+1));
		}
	}
	
	

}
