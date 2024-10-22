package pac11;

public class H {
	{
		System.out.println("iib");
	}
	static {
		new B();
		System.out.println("sib");
		new B();  
	}
	public static void main(String[] args) {
		System.out.println("from main");
	}
}
