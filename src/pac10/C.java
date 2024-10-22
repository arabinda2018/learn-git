package pac10;

public class C {
	{
		System.out.println("from iib -1");
	}
	C(){
		System.out.println("from constructor");
	}
	{
		System.out.println("from iib -2");
	}
	
	public static void main(String[] args) {
		System.out.println("start main");
		C c1 =new C();
		System.out.println("from main");
	}
}
