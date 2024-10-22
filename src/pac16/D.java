package pac16;

public class D implements Ainterface{
	public void test() {
		System.out.println("from test");
	}
	public void xYZ() {
		System.out.println("from xYZ");
	}
	public static void main(String[] args) {
		D d1 = new D();
		d1.test();
		d1.xYZ();
	}

}
