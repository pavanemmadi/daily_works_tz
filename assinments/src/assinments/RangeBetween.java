package assinments;

import java.util.Scanner;

public class RangeBetween {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("enter the lowest Number :");
		
		int l = sc.nextInt();
		
		System.out.print("enther the highest number ;");
		int h =sc.nextInt();
		
		for (int i = l; i <= h; i++) {
			if (i % 2!= 0) {
				System.out.print(i + "    ");
			}

	}

	}
}
