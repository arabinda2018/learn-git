package pac12;

public class N {
N(int i ){
	System.out.println(i);
}
N(){
	this(100);
	System.out.println("Notes");
}
public static void main(String[] args) {
	N n1 = new N();
}
}
