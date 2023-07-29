
public class forBreakLoop {

	public static void main(String[] args) {
		
		int counter=0;
		while(counter<=50) {
			counter++;
			if(counter==12)
				break;//exit the loop
			if(counter==8)
				continue; //countinues with the next value of the counter
			System.out.println(counter);
			
		}
	}

}
