package pac16;

public class BB implements AA{
@Override
	public void test() {
System.out.println("from test");		
	}
@Override
	public void xyx() {
		System.out.println("from xyz");
	}
	public static void main(String[] args) {
		BB b = new BB();
		b.test();
		b.xyx();
	}
	

}
