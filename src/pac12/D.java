package pac12;

public class D {
	int i =-32;
	//2 this  keyword cann't  be use inside static context
public static void main(String[] args) {
	D d1= new D();
	System.out.println(this.i);
	d1.test();
}
public static void test() {
	System.out.println(this.i);
}

public void test2() {
	System.out.println(this.i);
}


}
