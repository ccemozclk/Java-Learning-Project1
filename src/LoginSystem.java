
import java.util.Scanner;


public class LoginSystem {
	private Authentication auth;
	
	public LoginSystem(Authentication auth) {
		this.auth = auth;
	}
	
	
	public void login() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter User Name Or E-Mail : ");
		String userNameOrEmail = scanner.nextLine();
		
		System.out.println("Please Enter Password : ");
		String userPassword = scanner.nextLine();
		
		
		boolean isAuthenticated = auth.authentication(userNameOrEmail, userPassword);
		
		if (isAuthenticated) {
			System.out.println("Hi " + userNameOrEmail + " The information entered is correct, \n"
					+ "you will be directed to the home page !");
		} else {
			System.out.println("User name or Email was entered incorrectly, please check.");
		}
		scanner.close();
	}
	
}
