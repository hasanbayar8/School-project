
public class methods2 {

	public static void main(String[] args) {
		//countTo();
		
		for (int i = 10; i >=1; i--) {
			countTo2(i);
		}
	
	}
	
	public static void countTo() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i ; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	
	
	public static void countTo2(int number) {
		for (int i = 1; i <= number; i++) {
			System.out.print(i);
		}
		System.out.println();
	}

}
