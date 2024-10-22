package pac12;

public class F {
	public static void main(String[] args) {
		F f1 = new F();
		f1.test();

	}

	public void test() {
		this.test1();
	}

	public void test1() {
		System.out.println("from test");
	}

}
