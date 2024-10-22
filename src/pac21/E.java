package pac21;

public class E {
	static E a1;
	int i = 10;

	E(E a2) {
		System.out.println(a2.i);
	}

	public static void main(String[] args) {
		a1 = new E(a1);

	}
}
