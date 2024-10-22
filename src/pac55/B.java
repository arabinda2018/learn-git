package pac55;
//palindrome madam  loop inside loop
public class B {
public static void main(String[]args) {
	String s1 ="madem";
	int count =0;
	int j =s1.length()-1;
	for(int i =0;i<s1.length();i++) {
		//System.out.println(i);
		//System.out.println(j--);
	if(s1.charAt(i)==s1.charAt(j--)) {
		count++;
	}
	
	
	}
	if(count ==s1.length())
	System.out.println("palindrome");
	else {
		System.out.println("not palindrome");
	}
}
}
