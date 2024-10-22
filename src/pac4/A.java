package pac4;

public class A {
	static int j;
	static int i;
	public static void main(String[] args) {
		int k =10;
		System.out.println(k);
		A a1 = new A();//local
		a1.test();
	}
	public void test() {
		System.out.println(i);
		System.out.println(a1.j);//error
	}

}
