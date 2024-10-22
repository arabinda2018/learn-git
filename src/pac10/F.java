package pac10;

public class F {
	//sib runs before main method  and it doesn't require
	//any invoking stateemnt.
	static int i;
	static {
		i =20;
		System.out.println(i);
	}
	static {
		System.out.println("frm sib2");
	}
	

	public static void main(String[] args) {
System.out.println("from main");
	}
}
