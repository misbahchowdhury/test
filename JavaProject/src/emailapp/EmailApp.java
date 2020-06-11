package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email e1=new Email("misbah", "chowdhury");
		e1.setAlternateEmail("mm@gmail.com");
		System.out.println(e1.getAlternateEmail());
		e1.displayInfo();
	
	}

}
