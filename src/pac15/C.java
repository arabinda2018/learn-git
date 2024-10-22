package pac15;
class First{
	public void test1() {
		System.out.println("a");
	}
	public void test2() {
	System.out.println("test2");
	
	}
	}
public class C extends First {
public void test1() {
	System.out.println("test1");
}
public static void main(String[] args) {
C c = new C();
 c.test1();
 c.test2();
}


}
