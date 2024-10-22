package pac9;
/*
 * method can have same name as that of class 
 * Notes constructor can never have return type
 *(including void)
 * 
 */
public class I {
void I() {
	System.out.println("I");
	return;
}
public static void main(String[] args) {
	I  i1 = new I();
	System.out.println("main");
}
}
