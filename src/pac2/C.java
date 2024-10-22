package pac2;

public class C {
int i =10;
static int j =20;
public static void main(String[] args) {
	C c1 = new C();
	System.out.println(c1.i);
	System.out.println(C.j); 
	C c2 = new C();
	System.out.println(c2.i);
}
}
