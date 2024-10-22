package pac7;
/*
 * return keyword reutrns the control of the method
 * back to the place from where it is call
 * 
 * when you are using only return keyword make sure that the
 * method is of the type void
 * 
 * return keyword should be the last statement inside a method
 * 
 * If there are some statements immediately after return keyword
 * then those statement will never execute and henche we will get an error
 * on reachable code.

 */

public class A {
public static void main(String[] args) {
	A a1 = new A() ;
	a1.test();
	
}
public void test() {
	System.out.println("test");
	return;
}
}
