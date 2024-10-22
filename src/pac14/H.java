package pac14;
class Mu{
	public void test1() {
		System.out.println("test1");
	}
}



public class H  extends Mu{
public void test2() { 
	System.out.println("test2");
}
public static void main(String[] args) {
	H h = new H();
	h.test1();
	h.test2();
}
}
