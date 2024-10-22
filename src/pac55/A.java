package pac55;

public class A {
	public static void main(String[] args) {
		// find biggest word
		String s1 = "test test testing";
		String[] s2 = s1.split(" ");
		String temp = null;
		if (s2[0].length() > s2[1].length() && s2[0].length() > s2[2].length()) {
			temp = s2[0];
		}
		if (s2[1].length() > s2[0].length() && s2[1].length() > s2[2].length()) {
			temp = s2[1];
		}
		if (s2[2].length() > s2[0].length() && s2[2].length() > s2[1].length()) {
			temp = s2[2];
		}

		if (temp != null) {
			System.out.println("The biggest word is :" + temp);
		} else {
			System.out.println("many word with same size");
		}
	}
}
