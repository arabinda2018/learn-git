package pac9;
/*
 * the return type  of a constructor is always void and 
 * hence we can use only return keyword in it but then 
 * we can not return value
 * 
 */
public class B {
	public static void main(String[] args) {
		B b1 = new B();
		System.out.println("main");
	}

	B() {
		System.out.println(" B");
		return;
	}
}
