package pac13;
//super keyword is place with arguement with out argument both.


class AReal{
	AReal(){
		System.out.println("AReal");
	}
}



public class J extends  AReal{
	
J(int i){
	//super placed by compiler
	System.out.println(i);
	
}
public static void main(String[] args) {
	 new J(100);
}
}
