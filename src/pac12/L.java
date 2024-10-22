package pac12;

public class L {
//	using this keyword we can call constructor of same class
//	but then to do this keyword should be very first statement inside another constructor

	L(){
		System.out.println("Notes");
	}
	L(int i ){
		this();
		System.out.println(i);
	}
	public static void main(String[] args) {
		new L(100);
	}
}
