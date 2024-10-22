package pac8;
/*
 * we can create multipile constructor
 * in the same class provided they are 
 * deferenciated based on the number of argument and
 * type of arguments
 * 
 */
public class E {
	E() {
		System.out.println("E");

	}

	E(int i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		E e1 = new E();
		E e2 = new E(200);
	}
}
