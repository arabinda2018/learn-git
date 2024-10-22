package pac54;

public class A {

	// string is a class in java which consist of several built in methods
	// using which we can manipulate string data easily
	// ex1:
	public static void main(String[] args) {

		String s1 = "pankaj IS Notes java trainer";
		/*
		 * System.out.println(s1.toLowerCase()); System.out.println(s1.toUpperCase());
		 * 
		 * System.out.println(s1.trim());
		 */
		String[] s2 = s1.split(" ");
		System.out.println(s2[0].length());
		System.out.println(s2[1].length());
		System.out.println(s2[2].length());
		System.out.println(s2[3].length());
		String s1_ = "Pankaj";
		System.out.println(s1_.startsWith("P"));
		System.out.println(s1_.startsWith("Pa"));
		System.out.println(s1_.endsWith("j"));
		System.out.println(s1_.endsWith("aj"));

		String a1 = "testing";
		for (int i = 0; i < a1.length(); i++) {
			System.out.print(a1.charAt(i));
		}
		for (int i = a1.length() - 1; i >= 0; i--) {
			System.out.print(a1.charAt(i));
		}

	}

}
