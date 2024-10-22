package pac3;
//refrence variable 1 :local 
//				  2 :Static 
//refreence variable are use to store mameory addresses,
//it can never store ordinary value

//local refrence variables:
//they are created with in a method and should be used
//only with in created method 
//example class L

public class L {
int i =10;
public static void main(String[] args) {
	L l1 = new L();
	System.out.println(l1.i);
	l1.test();
}
public void test() {
	System.out.println(l1.i);//error
}

}
