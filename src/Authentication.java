
import java.util.List;


public class Authentication {
	
	private List<User> userList;
	
	public Authentication(List<User> userList) {
		this.userList = userList;
	}
	
	public boolean authentication (String userNameOrEmail, String Password) {
		for (User user: userList) {
			if (( user.getuserName().equals(userNameOrEmail) || user.getuserMail().equals(userNameOrEmail) )
					&& user.getuserPassword().equals(Password)) {
				return true;
			} 
		}
		return false;
	}
}
