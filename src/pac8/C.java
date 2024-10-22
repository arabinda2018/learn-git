package pac8;

public class C {
	C(){
		System.out.println("C");
	}
	public static void main(String[] args) {
		new C();
		new C();
		C c = new C();
	}
} 
