package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] arr = new int[N];
		int count = 0;
		
		for(int i = 0; i<N; i++) {
			arr[i]= in.nextInt(); 
			int v = in.nextInt();
			
			for(int j = 0; j<N; j++) {
				if(arr[i]==v) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
