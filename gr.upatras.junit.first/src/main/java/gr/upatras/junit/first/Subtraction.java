package gr.upatras.junit.first;

public class Subtraction {
	
	public static String sub(int a, int b) {
		int res=a-b;
		if (res>=0) return "POSITIVE";
		else return "NEGATIVE";
	}

}
