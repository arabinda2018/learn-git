package pac12;

public class G {
	public static void main(String[] args) {
		G f1 = new G();
		f1.test();

	}

	public void test() {
		this.test1();
	}

 	public static void test1() {
		System.out.println("from test");
	}
 	//we are calling a static method.
 	

}
