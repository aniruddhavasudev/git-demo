package selone;


public class primeNumberonot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 23 ;
		int remainder;
		int remainderb;
		
//		for(int i = 2; i<= a/2 ;i++) {
			
			int b = a % 2;
			int c = a % 3;
			
			if(b == 0) {
				System.out.println("not prime");
				;
			}
			
			else if(a == 1) {
				System.out.println("Is not prime Number");
			}
			
			else if( c==0){
				System.out.println("is not prime");
			}
			
			else {
				System.out.println("is prime");
			}
			
		}
		
	}


