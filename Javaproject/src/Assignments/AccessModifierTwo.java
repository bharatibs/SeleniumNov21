package Assignments;

public class AccessModifierTwo {

	public static void main(String[] args) {
		AccessModifierOne publicmethod = new AccessModifierOne();
	//	AccessModifierOne.AccessPublic();
		publicmethod.AccessPublic();
		publicmethod.AccessProtect();
	//	AccessModifierOne.AccessDefault();
		
		publicmethod.AccessDefault();
	}

}
