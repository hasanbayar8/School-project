
public class methods3 {

	public static void main(String[] args) {
		int number=6;
		boolean r= isPrime(number);
		
		if(r==true)
			System.out.println("prime");
		else//r==false
			System.out.println("not prime");
		
		System.out.println(isPrime(7) ? "prime":"not prime");
		
		
		
	
	}
	
	public static boolean isPrime(int number) {
		boolean result=true;
		for (int i = 2; i < number; i++) {
			if(number%i==0)
				result=false;
		}
		
		return result;
		
		
	}
	
	
	
	

}
