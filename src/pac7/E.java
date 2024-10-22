package pac7;
/*
 * Whenever a method is returning value
 * the return type of method can never be void
 * 
 */
public class E {
	public static void main(String[] args) {
		E e1 = new E();
		float i = e1.test();
		System.out.println(i);
	}

	public float test() {
		System.out.println("test1");
		return 30.3f;
	}
}
