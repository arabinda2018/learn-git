package pac52;
//methdo generic 
public class E<X> {
	X i;
	A a1;
	
	public X test() {
		a1=new A();
		a1.i=30;
		return i;
	}
	
	
	public static void main(String[] args) {
		E e2 = new E();
		e2.test();
		
	System.out.println();
}
}
