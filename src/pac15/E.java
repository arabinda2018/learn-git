package pac15;
class Test15{
	void test() {
		System.out.println("A");
	}
} 
public class E extends Test15 {
	public void test1() {
		System.out.println("test1");
	}
	public static void main(String[] args) {
		E e1 = new E();
		e1.test();
	}

}
