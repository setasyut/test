package junit.tutorial;

public class Calculator {

	public int maltiply(int a, int b) {
		return a * b;
	}

	public float divide(int a, int b) {
		
		if (b == 0) {
			throw new IllegalArgumentException("divide by zero"); 
		}	
		
		return (float)a / (float)b;
	}
}
