package pac8;

public class F {
	F(){
		System.out.println("F");
	}
	F(int i ){
		System.out.println(i);
	}
	F(String x,int k){
		System.out.println(x);
		System.out.println(k);
		
	}
	public static void main(String[] args) {
		F f1 = new F();
		F f2 = new F(4);
		F f3 = new F("hi",9);
	}

}
