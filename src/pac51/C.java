package pac51;

public class C {
public static void main(String[] args) {
	assert test();
	System.out.println("from main");
}
public static  boolean test() {
	System.out.println("From test");
	return false;
}
}
