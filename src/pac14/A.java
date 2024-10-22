package pac14;
//hear non static member of parent class are 
//inherited to the child class object so that we can re use
//the members of parent class.
class Drop{
	int i =10;
	static int j =32;
}

public class A extends Drop{
public static void main(String[] args) {
	A a1 = new A();
System.out.println(a1.i);

}
}
