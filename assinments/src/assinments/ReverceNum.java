package assinments;

import java.util.Scanner;

public class ReverceNum {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		 System.out.println("enter the number:");
		 long num = sc.nextInt();
		  long rev =0;
		  while(num!=0)
		  {
			  rev =rev*10 + num%10;
			  num=num/10;
		  }
		  System.out.print("reverse number:" +rev);
			  
			  
		  }
		

	}


