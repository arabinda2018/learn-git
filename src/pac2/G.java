package pac2;

public class G {

	static int i =19;
	public static void main(String[] args) {
		System.out.println(G.i);
		G g1 = new G();
		g1.test();
	}
	public void test() {
		System.out.println(G.i);
	}
}
