public class User {
	 private static int counter = 0; 
	 private int userID;
	 private final String userName;
	 private String userMail;
	 private String userPassword;
	 private String userAddress;
	
	public User(String userName, String userMail, String userPassword, String userAddress) {
		this.userID = ++counter;
		this.userName = userName;
		this.userMail = userMail;
		this.userPassword = userPassword;
		this.userAddress = userAddress;
	}
	
	public int getuserID() {
		return userID;
	}
	
	public String getuserName() {
		return userName;
	}
	
	public String getuserMail() {
		return userMail;
	}
	
	public void setuserMail(String newMail) {
		this.userMail = newMail;
	}
	
	public String getuserPassword() {
		return userPassword;
	}
	
	public void setuserPassword(String newPassword) {
		this.userMail = newPassword;
	}
	
	public String getuserAddress() {
		return userAddress;
	}
	
	public void setuserAddress(String newAddress) {
		this.userAddress = newAddress;
	}
	
}
