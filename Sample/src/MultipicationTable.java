import java.util.Scanner;

public class MultipicationTable {

	public static void main(String[] args) {
 System.out.print(" enther table number:");
       Scanner sc = new Scanner (System.in);
 int num = sc.nextInt();
        	int	i = 1;
        while(i <= 10)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
            i++;
        }

	}

}
