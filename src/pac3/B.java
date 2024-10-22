package pac3;

public class B {
public static void main(String[] args) {
	int i =10;
	System.out.println(i);
	B b1 = new B();
	b1.test();
}
public void test() {
	System.out.println(i);//error
}
}
