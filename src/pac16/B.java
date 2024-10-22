package pac16;

public class B implements A1 {
	//A class consist of only complete method
	//An interface consit of only incomplete method.
//interface are just like contract what a class gets into 
//	and the class should follow the contract ie
//incomplete method inherited from an interface should be completed 
	//in a class.
//if you don't complete method in class then you will get an error

//we inherite the member of interface which is incomplete and then
//we overrided with the complete method in the subclasses.
	
	//but in jdk 1.8 we can write complete method also
	@Override
	public void test() {
		System.out.println("from test");	
	}
	public static void main(String[] args) {
		B b = new B();
		b.test();
	}
}
