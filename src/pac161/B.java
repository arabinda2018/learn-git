package pac161;

public class B implements A{

	@Override
	public void test() {
		System.out.println("From test");
	}
	public static void main(String[] args) {
		B b = new B();
		b.test();
	}

}
