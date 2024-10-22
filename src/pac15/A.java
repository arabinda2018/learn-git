package pac15;
//god is also multipile form
//gaja laxmi,dhana laxmi, raj laxmi,asta laxmi
//politician...in bangloe it job ,rural place cultivate
//only speech is different work is not different....
//polymerphism ..........
//overloading
//overiding 

/*Developing a feature  such that it can take 
 * more than one form is called polymerphism
 * overriding:
 *After inhering a method from parent class if you
 *want to modify that inherited method
 *then we use the concept of overriding.
 *
 *2.Inheritance is mendataoy for overriding
 *
 * overrding is possible only on  a method
 * overriding of a variable doesn't make any sence
 * modificaton we do for a logic
 * overriding of a variable is not possible
 * 
 */

class Casio{
	void test() {
		System.out.println("Casio");
	}
}
public class A extends Casio {
@Override
public void test() {
	System.out.println("calc");
}
public static void main(String[] args) {
	
	A a1 = new A();
	a1.test();
	Casio c1 = new Casio();
	c1.test();
}
}
