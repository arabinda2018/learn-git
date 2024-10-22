package pac3;
//static ref variable
//these variables are created outside all the methods
//but then inside the class using static keyword
/*
 * these variables can be used anywhere in the class as they 
 * have global access
 * 
 * 
 */
public class N {
static  N n1;
int  i;
public static void main(String[] args) {
	N n1 = new N();
	System.out.println(n1.i);
	n1.test();
		
	}
public void test() {
	System.out.println(n1.i);
}
}
