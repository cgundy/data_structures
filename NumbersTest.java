package week4;

public class NumbersTest {

	public static void main(String[] args) {
		
		Numbers a = new Numbers(6,7); 
		Numbers b = new Numbers(6,3);
		
		int result1 = a.plus(b);
		System.out.println("Plus method result: " + result1);
		
		int result2 = a.minus(b);
		System.out.println("Minus method result: " + result2);
		
		int result3 = a.times(b);
		System.out.println("Times method result: " + result3);
		
		int result4 = a.divideBy(b);
		System.out.println("Division method result: " + result4);
		
        boolean result5 = a.equals(b);
        System.out.println("Equals method result: " + result5);
        
        String result6 = a.toString();    
        System.out.println("String method result: " + result6);
        


	}

}


