package pac9;

public class G {
G(){
	System.out.println("G");
}
public void test() {
	System.out.println("from test");
}
public static void main(String[] args) {
	 new G().test();
	 System.out.println("main");
}
}
