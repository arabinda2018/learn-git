package pac14;
class Alphamain{
	int i =10;
}
class Beta extends Alphamain{
	
}

public class G extends Beta{
public static void main(String[] args) {
	G g = new G();
	System.out.println(g.i);
}
}
//inheritnance is represented b olta arrow mark
//A<........B<................C<....................