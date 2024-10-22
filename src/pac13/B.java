package pac13;

class A {
	int i = 10;
}
//1.using super keyword we can access the members of parent class
public class B extends A {// Super class
	public static void main(String[] args) {
		B b1 = new B();
		b1.test();

	}

	public void test() {
		System.out.println(super.i);
	}
}
