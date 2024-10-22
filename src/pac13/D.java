package pac13;
class Z1{
	static int  j=100;
}


//using super keyword we can access static and non static member

public class D extends Z1{
public static void main(String[] args) {
	D d = new D();
	d.test();
	
}
public void test() {
	System.out.println(super.j);
}
}
