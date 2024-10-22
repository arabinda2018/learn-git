package pac12;

public class C {
int i =10;
public static void main(String[] args) {
	C c1 = new C();
	C c2 = new C();	
	System.out.println(c1);
	System.out.println(c2);
	c2.test();
}
public void test() {
System.out.println(this);	
}
//this keyword current object
}
