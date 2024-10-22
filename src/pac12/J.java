package pac12;

public class J {
	int i;
	public static void main(String[] args) {
		J j2 =new J();
		j2.test(100);
		
	}
	public void test(int i ) {//local variable
	//local variable can  never be access using this keyword
		this.i =i;
		System.out.println(this.i);
		
	}


}
