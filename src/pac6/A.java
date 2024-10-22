package pac6;
/*methods will execute when we call it 
 * method will return the control back to the 
 * place from where it is call
 * 
 */
public class A {
	public static void main(String[] args) {
		A a1 = new A();
		a1.test();
		System.out.println("from main");
		
	}
	public void test() {
		System.out.println("from test");
		
	}

}
