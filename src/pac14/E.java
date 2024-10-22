package pac14;

class Track {
	int i = 10;
}

public class E {
	public static void main(String[] args) {
		Track t = new Track();
		System.out.println(t.i);
		// object of one class can be created in another class
		// but that is not inheritance
	}

}
