package pac13;

/*using super keyword we can call constructor of parent class
 but then we should use super keyword in child class constructor
 and it should be very first statement.
//super keyword to call a constructor should be present inside child class constructor
//it should be first statement 
//but if you are accessing any variable and method it can be any number 1st statement 2nd statement
//anywhere it will work.
//we cann't call a costructor using super keyword from a method.
 */

class Demo {
	Demo() {
		System.out.println("demo");
	}
}

public class F extends Demo {
	F() {
		//System.out.println("hi");//you can't make super keywor 2nd statement
		//
		super();
	}

	public static void main(String[] args) {
		new F();
	}

}
