package pac11;
// we can create an object inside sib
//example:
public class D {
	{
		System.out.println("iib");
	}
	
	static{
		new D();
		
		System.out.println("sib");
		
		
	}
	D(){
		System.out.println("GoldAccount");
	}
	public static void main(String[] args) {
	
		System.out.println("main");
	}
}
