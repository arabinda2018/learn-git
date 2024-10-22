package pac3;

public class F {
static int i;
public static void main(String[] args) {
	System.out.println(F.i);
	F f = new F();
	f.test();
	
}
public void test() {
	System.out.println(F.i);
	
}
}
