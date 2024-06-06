package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email email1 = new Email("Leticia", "Schneider");
		
		email1.setAlternateEmail("leticia@mail.com");
		System.out.println(email1.getAlternateEmail());
		
		System.out.println(email1.showInfo());
	}

}
