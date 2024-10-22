package pac6;

public class C {
public static void main(String[] args) {
	C c1 = new C();
	System.out.println("main");
	c1.test1();
	
}
public void test1() {
	C c2 = new C();
	c2.test2 ();
	System.out.println("test1");
}
public void test2() {
	System.out.println("test2");
}
}
