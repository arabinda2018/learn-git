package pac12;
//3.using this keyword we can access static and non static member
public class E {
	int i =32;
	static int j=20;
	public static void main(String[] args) {
		E e1 = new E();
		e1.test();
		
	}
	public void test() {
		System.out.println(this.i);
		System.out.println(this.j);
	}

}
