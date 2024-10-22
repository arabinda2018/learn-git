package pac11;

public class C {
	{
		System.out.println(1);
	}
	{
		System.out.println(2);
	}
	static{
		System.out.println(3);
		
	}
	C(){
		System.out.println(4);
	}
	public static void main(String[] args) {
		C c1 = new C();
		System.out.println("main");
	}
}
