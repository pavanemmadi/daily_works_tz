
public class Emplyee {
  int empno   ;
  String name ;
  float sal ; 
  Emplyee(){}
  
  Emplyee(int a,String b){
	  empno =a ;
	  name =b ;
  }
  Emplyee(int a,String b,float c){ 
	  empno = a;
	  name = b;
	  sal = c ;
  }
  

  void getDetails() {
	  System.out.println(empno + "|" + name +"|" +sal);
	  
  }
 
 public static void main (String[]args) {
	      Emplyee pavan1 =new Emplyee();
	      Emplyee pavan2 =new Emplyee(10,"lol");
	      Emplyee pavan3 =new Emplyee(88,"jjj", 3355f);
	     
	     pavan1.getDetails();
	     pavan2.getDetails();
	     pavan3.getDetails();
	     
	    
	     
	     
	     
 
  
}
    
}
  


  
 


