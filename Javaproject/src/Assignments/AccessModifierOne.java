package Assignments;

public class AccessModifierOne {
	public  void AccessPublic(){
		System.out.println("Hello World! I am Public Access modifier");
	}
	
	private void AccessPrivate(){
		System.out.println("Hello World! I am Private Access modifier");
	}
	protected void AccessProtect(){
		System.out.println("Hello World! I am Protected Access modifier");
	}
	
	 void AccessDefault(){
		System.out.println("Hello World! I am Default Access modifier");
	}
	public static void main(String[] args) {
		AccessModifierOne accesspub = new AccessModifierOne();
		accesspub.AccessPublic();
		accesspub.AccessPrivate();
		accesspub.AccessProtect();
		accesspub.AccessDefault();
	}
	
	

}
