package pac13;
//if in the parent class there is only constructor with arguments then 
//as a programmer we should explicitly write super keyword  in child class constructor





class Moto{
	Moto(int i){
		System.out.println(i);
	}
}
public class K  extends Moto{
K(){//error
	super(10);
	System.out.println("B");
}
public static void main(String[] args) {
	 new K();
}
}
