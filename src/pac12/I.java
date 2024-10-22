 package pac12;

public class I {
	int i;
	public static void main(String[] args) {
		I i1 = new I();
		i1.test();
		
	}
	public void test() {
		int i =23;
		this.i=i;
		System.out.println(this.i);
	}
// two variable can be same name 
//	static local and non static local  can have same name 
}
