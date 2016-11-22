package abstractClassDemo;

public class Test {
  public static void main(String[] args) {
	  Employee temp = new IT();
	  Employee temp1 = new HR();
	  Employee temp2 = new Accounts();
	  Employee temp3 = new Security();
	  
	   temp.day();
	   temp.message();
	  
	   temp1.day();
	   temp1.message();
	 
	   temp2.day();
	   temp2.message();
	  
	   temp3.day();
	   temp3.message();
	   
	   Accounts temp4 = new Accounts();
	   temp4.message2();
	   
	   Security temp5 = new Security();
	   temp5.message2();
	   
}
}
