package pac13;

class Real{
	Real(){
		System.out.println("Real");
	}
}
public class H  extends Real{
	//if you don't create child class constructor with out arguments then compiler
	//will keep automatically no args constructor 

/*	H(){
		super();
	}*/
	public static void main(String[] args) {
		new H();
	}
	
	
}
