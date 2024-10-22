package pac56;

public class Equals {
public static void main(String[] args) {
	//==compare memory address.
	//equals() compare value of String.
String s1 = new String("xyz");
String s2 = new String("xyz");
System.out.println(s1==s2);
System.out.println(s1.equals(s2));

String s4 = new String("xyz");
String s3 = new String("Xyz");
System.out.println(s3==s4);
System.out.println(s3.equals(s4));

String s11 ="xyz";
String s12="xyz";//dont create one more object
String s13 ="xxx";//crette new objecj
String s14="xyz";//dont create one more object,1 obj has 3 reference
System.out.println(s11==s12);//t
System.out.println(s12==s14);//t
System.out.println(s13==s11);//f

String  s9 = new String("xyz");
String s10= new String("xyz");//every time it will crete an object

String a1 = new String("xyz");
String a2 = new String("xyz");
String a3 ="xyz";
String a4 ="xyz";
String a5 = new String ("xyz");
String a6 ="xyz";
System.out.println(a1==a2);//f
System.out.println(a3==a4);//t
System.out.println(a5==a3);//f
System.out.println(a6==a3);//t

String s111 ="Notes";
String s222= new String("Notes");
String s333="Notes";
String s000="B";

String s1_="Notes";
s1_="C";
}
}
