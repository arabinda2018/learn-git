package pac15;
//static member can n't over riding
//boss static member cann't inherit only

public class GoldAccount extends SilverAccount{
	public void  chqBooks() {
		System.out.println("unlimted chqbook");
		
	}
	public static void main(String[] args) {
		GoldAccount g1 = new GoldAccount();
		g1.chqBooks();
		g1.phBanking();
		g1.atmCard();
		System.out.println(".........");
		
		SilverAccount s1 = new SilverAccount();
		s1.chqBooks();
		s1.phBanking();
		s1.atmCard();
	}

}
