package pac56;
/*setter  intilize  value  variable through method
getter   reading the value of a method  get the variable

*1)make class final 
*2)make variable final & private
*3)Initialize variable through constructor
*4)Use only getter don't use setter
*
*
*
*/
public class A1 {

public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

int age;//setAge(),getAge()
//String name;//setName() getName()

public static void main(String[] args) {

	A1 a1 = new A1();
	a1.setAge(20);
	System.out.println(a1.getAge());
}
}
