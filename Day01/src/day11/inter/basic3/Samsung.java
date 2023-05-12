package day11.inter.basic3;

public class Samsung implements Printed {

	@Override
	public void print(String document) {
		System.out.println("Samsung:" + document);
	}

	@Override
	public void colorPrint(String document, String color) {
		System.out.println("Samsung:" + color +", " + document);
	}

	@Override
	public int copy(int n) {
		System.out.println("samsumg:" + n + "장 복사");
		return n;
	}
}
