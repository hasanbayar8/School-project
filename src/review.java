
public class review {

	public static void main(String[] args) {
		
		int n=0;
		n=n+1;
		System.out.println(n);//1
		n++;
		System.out.println(n);//2
		++n;
		System.out.println(n);//3
		System.out.println(n++); //post inc.
		System.out.println(n);//4
		
		System.out.println(++n);//pre inc.
		
		System.out.println(n);//5
		
		int b= 2* ++n;
		System.out.println("b:"+b);//12
		System.out.println("n:"+n);//6
		
		b=2*n++;
		System.out.println("b:"+b);//12
		System.out.println("n:"+n);//7
		
		System.out.println(n++ + ++n);//n=9
		System.out.println(++n + n++);//20 
		System.out.println(n);//11
		
		n/=5; //n=n/5
		System.out.println(n);
		n*=5;// n=n*5
		System.out.println(n);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
