package pac1;
// class is a factory which generate an object
//to request a class generate object we use new keyword followed by classname
//parathensis
//object is an instance of class 
//every time an object is created only non sttic memers get loaded into 
//object
//to access the object we store its memory address in the reference variable
//syntax classname refercevaiable = new Classname
public class A {
int i =10;
static int j =20;
public static void main(String[] args) {
	
	A a = new A();
	System.out.println(a.i);
}

}
