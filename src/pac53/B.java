package pac53;

public class B extends A {
	/*
	 * //Annotation
//An instruction given to compiler by the programmer

//junit perform white box testing
	 * 
	 * annotation are set of instruction given to the compiler during during
	 * compilation. annotation are introduce in jdk versions 1.5 Following
	 * annotation in java
	 * 
	 * @override:This annotation helps us to check whether we are overriding method
	 * or or not.
	 * @SuppressWarnings:These annotation helps us to supress warning messages in the programs
	 * @Deprecated:It helps us to notify that a particular method is not in use 
	 */
	@Override
	public void test() {
		System.out.println("from ehello");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int i;	
		dept();
	}
	@SuppressWarnings("unused")
	 public void test9() {
		 int i;
	 }
	@Deprecated
	public static void dept() {
		System.out.println("from test");
	}
	
	
	
	
	
}
