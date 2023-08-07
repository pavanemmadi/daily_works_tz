import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in); 
	        int n;     
	        

	        System.out.println("Enter the total subjects ");
	        n=sc.nextInt();
	        
	        //Declare the array
	        int arr[] = new int[n]; 
	        System.out.println("Enter the marks secured in each subject ");
	        for(int i=0;i<n;i++)  
	        {
	            arr[i]=sc.nextInt();
	        }
	        
	        int total=0;
	        //Calculate the total marks
	        for(int i=0;i<n;i++)
	        {
	            total=total+arr[i];
	        }
	       
	        System.out.println("The total marks obtained is "+total);
	        
	       
	        
	        //Display the total percentage
	        System.out.println( "Total Percentage : " + "");                         
	    }   
	

	}


