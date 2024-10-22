package pac10;

public class G {
	// we can not iniitilize non static varaible
	// inside sib
	int i;
	static {
	//get error 	i = 30;
	}

	public static void main(String[] args) {
		System.out.println("from main");
	}
}
