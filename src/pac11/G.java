package pac11;

public class G {
	/*
	 * if we create an object inside iib
	 * you will not get any error but then
	 * program will halt abdroptely.
	 * 
	 */
	{
		System.out.println("from iib");
		new G();
	}
		public static void main(String[] args) {
G g1 = new G(); 	
}
}
