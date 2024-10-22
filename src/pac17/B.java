package pac17;

//we can never create object of an interface
//2.we can never keep main method in an interface
public class B implements A{
	public static void main(String[] args) {
		System.out.println(A.i);
		//A a1 = new A();
	}

}
