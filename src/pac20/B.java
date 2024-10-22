package pac20;

public class B {
	public static void main(String[] args) {
		try {
			int i = 10 / 0;
		} catch (Exception e) {
			System.out.println("complete");
		}

	}
}
//in java handle the exception we use try catch block
//whenever exception happen inside try block,try will create
//an exception object and reference of that object it  will be given
//to catch.catch will now handle the exception and hence
//program will not halt abruptly.

