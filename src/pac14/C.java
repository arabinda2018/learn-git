package pac14;
/*
 * static member don't get inherited 
but then they give us the fill of 
inheritance by converting statement
in the above example B.i converted to A.i
 */
class A1{
	static int i=10;
	
}

public class C extends A1{
public static void main(String[] args) {
	System.out.println(C.i);//A1.i
	
	
}
}
