package pac13;

class A1992{
	A1992(){
		System.out.println("A");
	}
}
public class I extends A1992{
I(){
//	super();//placed by compiler
	System.out.println("I");
}
public static void main(String[] args) {
	 new B();
}
}
