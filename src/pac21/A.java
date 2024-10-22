package pac21;

public class A {
	static A a1;
	int i = 10;

	public static void main(String[] args) {
		System.out.println(a1.i);
		System.out.println("completed");

	}
}
//if you are accessing member of the class with the null
//reference then we get null pointer exception