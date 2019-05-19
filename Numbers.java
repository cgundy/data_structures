package week4;

final class Numbers {
	
	private final int value1;
	private final int value2;
	
	public Numbers(int a, int b)
    {
		value1 = a;
		value2 = b;
    }

	public int plus(Numbers b) { 
		return this.value1 + this.value2 + b.value1 + b.value2;
	 } 
	
	//overloading
//	public int plus(Numbers b, int c) {
//		return value1;
//		
//	}

	public int minus(Numbers b) {
		return (this.value1 - this.value2) - (b.value1 - b.value2);
		}
	
	public int times(Numbers b) {
		  return (this.value1 * this.value2) * (b.value1 * b.value2); 	
		}
	
	public int divideBy(Numbers b) {
		
		if (this.value2 == 0 || b.value2 == 0 || (b.value1 / b.value2) == 0) {
					
			  System.out.println("Cannot divide by zero");
			  return 0;
			}
		
		return (this.value1 / this.value2) / (b.value1 / b.value2) ;	
		}
	
	public boolean equals(Numbers b) {
		
		if(this.value1 == b.value1 && this.value2 == b.value2) {			
			return true;				
		}	
		return false;
	}	
	
	@Override
	public String toString() {
		
		return "(" + value1 + "," + value2 + ")";
	}
}




