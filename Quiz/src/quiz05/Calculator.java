package quiz05;

public class Calculator {
	
	double pi;
	int result;
	
	void add (int i) {
		result += i;
	}
	
	void sub(int i) {
		result -= i;
	}
	
	double circle(int i) {
		return i*i*pi;
	}

}
