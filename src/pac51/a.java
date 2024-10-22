package pac51;

//Assert helps us to check the business condition only if business condtion is true assert will 
//continue the program execution but if condition is false then assert is not going to continue
//with that execution.
// Assert was introuded in jdk version 1.4
// steps to configure 
//assert is used to check businnes conditin.
//shadi.com u can download your age should be >18
//9 year old kid cant create  account//bank account
//assert cant not use directly
//configuratin steps:run  run configuration click on argument  vm argument  -ea apply run
//-ea enable
//-da disable
public class a {
	public static void main(String[] args) {
		int age = 100;
		try {
			assert age > 200;
			System.out.println("register your self");
		} catch (AssertionError e) {
			System.out.println(e);
			System.out.println("you are  to young to register");
		}
	}
}
