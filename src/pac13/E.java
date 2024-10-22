package pac13;
//super keyword can not be use inside static context
class A18{
	static int j=100;
}




public class E extends A18 {
public static void main(String[] args) {
	E e1 = new E();
	e1.test();
}
public static  void test() {
	System.out.println(super.j);
}
}
