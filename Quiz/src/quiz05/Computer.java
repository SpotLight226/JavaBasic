package quiz05;

public class Computer extends Calculator{
	
	// add,sub도 사용가능
	double circle(int i) { // 원의 넓이(오버라이드)
		return i*i*Math.PI;
	}
	
	double rect(double i) { // 정사각형의 넓이
		return i*i;
	}
	
	double rect(double i, double j) { // 직사각형의 넓이
		return i*j;
	}
	
	double rect(double i, double j, double k) { // 직육면체의 넒이
		return 2*i + 2*j + 2*k;
	}
}
