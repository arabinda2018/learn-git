package pac11;

public class E {
static {
	System.out.println("sib");
}
static {
	System.out.println("hello");
	new E();
	
}
{
	System.out.println("iib");

}
public static void main(String[] args) {
	new E();
	return;
}
}
