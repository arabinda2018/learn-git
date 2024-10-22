package pac56;
//mutable object are the one whose values keep changing 
//immutable object are the one whose value can never alter.
//rules to design immutable class 
/*
 * 1)make class final 
*2)make variable final & private
*3)Initialize variable through constructor
*4)Use only getter don't use setter
 * 
 * 
 */
final class A {
final private int i;
final private int j;
A(int i ,int j){
	this.i=i;
	this.j=j;
}
public int getI() {
	return i;
}
public int getJ() {
	return j;
}
public static void main(String[] args) {
	A a1 = new A(10, 20);
	System.out.println(a1.getI());
	System.out.println(a1.getJ());
}
}
