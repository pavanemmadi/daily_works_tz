package assinments;

import java.util.Scanner;

public class Thearter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of ticket:");
		int t = sc.nextInt();
		System.out.println(" do you want refreshment; "); 
		String r =sc.next("");
		
		System.out.println("do you have coupon code :");
		
		String cc =sc.next("");
		System.out.println("enter the cirlcle:");
		String circle =sc.next("");
		if (circle.equals("k")){
			int total =t*75;
		}
		else if (circle.equals("q")) {
			int total =t*150;
		} 
		if(t>20) {
			 double sum =((0.1)*(total));
			double  sum1 =total-sum;
		}
			
		{
}
