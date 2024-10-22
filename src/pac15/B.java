package pac15;

//overriding of variable is not possible
class Dominos {
	int i = 10;
}

public class B extends Dominos {
int i = 20;

	public static void main(String[] args) {

		B b1 = new B();
		System.out.println(b1.i);
	}

}
