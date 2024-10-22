package pac9;

public class D {
	D(){
		System.out.println("GoldAccount");
		
	}
public static void main(String[] args) {
	D.test();
	D d1 = new D();
	d1.test();
	System.out.println("main");
}
public static void test() {
	System.out.println("test");
}
}
