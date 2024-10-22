package pac9;

public class C {
	C(){
	System.out.println("C");	
	}
	public static void main(String[] args) {
		C c2= new C();
		c2.test();
		System.out.println("main");
		
	}
	public void test() {
		System.out.println("from test");
	}
	

}
