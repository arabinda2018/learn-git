package pac12;

public class M {
M(){
	System.out.println("M");
}
M(int i){
	System.out.println(i);
	this();//error
}
public static void main(String[] args) {
	new L(100);
}
 
}
