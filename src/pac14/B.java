package pac14;

class Parent {
	int i = 10;

	public void test() {
		System.out.println("From test");
	}
}

public class B extends Parent {
	public static void main(String[] args) {
		B b1 = new B();
		b1.test();
		System.out.println(b1.i);
	}
}
