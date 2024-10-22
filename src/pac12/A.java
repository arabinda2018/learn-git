package pac12;

import java.util.Scanner;
/*1.this keyword points to current object which  is executing
2  using this keyword we can call static member but then this  keyword cann't  be use inside static context
3.using this keyword we can access static and non static member
4.we can call static and non statc method using this keywods
5.can not access local variable using this keywods
6.using this keywords we can call constrcutror but to do this  this keywords
 should be very first statment inside the constructor
ref created by jvm(this)
a1 iscreatd by me 
*/

public class A {
	int i = 10;

	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.i);
		a1.test();
	}
	public void test() {

		System.out.println(this.i);
	}
	// once object is created non static member loaded
}
