import java.util.Scanner;

public class methods {
	//program begins
	public static void main(String[] args) {
		//calling a method
		printStars(5);
		printStars(40);//parameter
		star();
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter star number:");
		int stars= s.nextInt();
		printStars(stars);
		
	}
	
	public static void printStars(int numberOfStar) {//argument
		for (int i = 0; i < numberOfStar; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
	public static void star() {
		System.out.println("*");
	}
	
	
}
