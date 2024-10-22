package pac13;
//using super keyword we can access static and non static member
class A1{
	public void xYZ() {
		System.out.println("xyz"); 
	}
}
public class C extends A1{
public static void main(String[] args) {
	C c1 = new C();
	c1.test();
	
}
public void test() {
	super.xYZ();
} 
}
