package pac15;

/*
 * While overriding if you are incrersing
 * the schope of access specifier then it
 * will not give any error
 * private default protected public 
 */
class A1992 {
	protected void test1() {
		System.out.println("A");
	}

	
}

public class D extends A1992 {
	public void test1() {
		System.out.println("test1");
	}

	public static void main(String[] args) {
		D d1 = new D();
		d1.test1();
		
	}
}
