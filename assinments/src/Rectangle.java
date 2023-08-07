   
class RectangleTest{
	public double length ;
    public  double breath ;
	 public  double area() {
		 return length*breath;
	 }
	 public double perimenter()
{return 2*(length+breath);
		
} 
	 public boolean square() {
		 return length==breath;
		 
	 }
	
}
public class Rectangle {
	

	public static void main(String[] args) {
		RectangleTest r =new RectangleTest();
		
		r.length=11.5;
		r.breath=23;
		
		System.out.println("area"+r.area() );
		System.out.println("rectangle"+r.perimenter());
		System.out.println(r.square());
	}

}
