package pac12;

public class a12 {
	int i = 10;

	public static void main(String[] args) {
		a12 a = new a12();
		System.out.println(a);
		a.test();
	}
	public void test() {
		System.out.println(this);
	}
}
//memory address of a and this keyword is same