package pac7;
//method calling statement can be inside sop only
//when method is returning value
/*
 * method calling statement can not be inside sop
 * if the method return type is void 
 */

public class G {
	public static void main(String[] args) {
		G g1 = new G();
		System.out.println(g1.test());
		
	}
	public void test() {
		System.out.println("test");
		
	}

}
