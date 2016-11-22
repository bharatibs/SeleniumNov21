package methodOverloading;

public class StringReturn {
	
    private String name;
    
	public void setName(String str){
		name = str;		
	}
	public String getName(){
	    return name;
	}

	public static void main(String[] args) {
		StringReturn strName1 = new StringReturn(); 
		strName1.setName("Bharati");
		
				
		System.out.println("You have entered your name as" + "-" + strName1.getName());
				
	}

}
