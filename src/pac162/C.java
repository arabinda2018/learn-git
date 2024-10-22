package pac162;

import pac161.A;

public class C implements A {
public void test() {
	System.out.println("Test");
}
public static void main(String[] args) {
	C c1 = new C();
	c1.test();
}
}
