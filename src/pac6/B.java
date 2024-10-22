package pac6;

public class B {
public static void main(String[] args) {
	B b1 = new B();
	b1.test();
	System.out.println("main");
	b1.test();
	
}
public void test() {
	System.out.println("test");
}
}
