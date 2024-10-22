package pac5;
/*Type casing
 * Auto upcasting
 * Explicit downcasting.
 * Type casting:
 * converting a particular data type into required data 
 * type is called as type casing
 * Auto apcasting:
 * converting smaller data type into bigger data type is called
 * with out any loss of data is called auto upcasting.
 * ex:auto upcasting:
 * whenever there is a loss of data during convesion 
 * regardless of memory size upcating cann't happen.
 * 
 */
class B{
	int i =1;
	long j =i;
}
class C{
	byte i =30;
	short j =i;
}
class D{
	long i =10;
	byte j =i;//error
	
}
class E{
	float i=10.3;
	float j =10.3f;
	double k =10.3;
	float f =10;
	
}
class F{
	float i =10.3f;
			long j =i;
}
class j{
	float i =10.3f;
	int j =i;
	
}
public class A {
	A i;
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.i);
	}

}
