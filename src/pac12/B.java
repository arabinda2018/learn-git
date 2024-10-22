package pac12;

public class B {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b);
		b.test();
	}

	public void test() {
		this.test1();

		System.out.println(this);

	}
	public void test1() {
		System.out.println("from test1");
	}
}
