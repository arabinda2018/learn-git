package pac13;
//constructor never get inherited
//constructor gives feel of inheritance but its  not inheritance
//when child object created parent class  constructor is call.
class Ju {
	Ju() {
		System.out.println("A");
	}

}

public class G extends Ju {
	G() {
//super();//compiler automatically  keep super
	}

	public static void main(String[] args) {
		new G();
	}
}
//if we don't keep super keyword inside child class constructor then compiler 
//will automatically place the super keyword such that it can call only no args
//construcor of parent class