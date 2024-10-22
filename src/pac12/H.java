package pac12;

public class H {
public static void main(String[] args) {
	H h1 = new H();
	h1.test();
	
}
public void test() {
	int k =30;
//5.can not access local variable using this keywods
 
	System.out.println(this.k);
}
}
