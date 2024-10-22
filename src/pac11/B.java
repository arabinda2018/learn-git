package pac11;

public class B {
	{
		System.out.println("iib");
	}
	B(){
		System.out.println("B");
	}
static {
	System.out.println("sib");
	
}
public static void main(String[] args) {
	new B();
}
}
