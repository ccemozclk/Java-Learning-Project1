import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		DatabaseConnection dbConnection = new PostgreDatabaseConnection();
		DatabaseTableManager tableManager = new DatabaseTableManager(dbConnection);
		
		String usersTableColumns = 
				"""
					UserID SERIAL PRIMARY KEY,
					UserName VARCHAR(14) NOT NULL,
					UserMail VARCHAR(250) NOT NULL,
					UserPassword VARCHAR(15) NOT NULL,
					UserAddress TEXT NOT NULL
				""";
		tableManager.creatNewTable("Users", usersTableColumns);
		
		User user1 = new User("Arif Isik", "arif.isik@halikilim.com", "arif123", "Istanbul/Turkiye");
		User user2 = new User("Ersan Kuneri", "ersan.kuneri@sinema.com", "yesilcam123", "Istanbul/Turkiye");
		User user3 = new User("Altan Camli", "altan.camli@bar.com", "bariaciyorum123", "Istanbul/Turkiye");
	
		List<String> userColumns = Arrays.asList("UserName", "UserMail", "UserPassword", "UserAddress");

	    tableManager.insertTable("Users", userColumns, Arrays.asList(user1.getuserName(), user1.getuserMail(), user1.getuserPassword(), user1.getuserAddress()));
	    tableManager.insertTable("Users", userColumns, Arrays.asList(user2.getuserName(), user2.getuserMail(), user2.getuserPassword(), user2.getuserAddress()));
	    tableManager.insertTable("Users", userColumns, Arrays.asList(user3.getuserName(), user3.getuserMail(), user3.getuserPassword(), user3.getuserAddress()));

	    System.out.println("All users have been successfully added to the database!");
	    
	    
	    List<User> users = Arrays.asList(user1, user2, user3);

	    Authentication auth = new Authentication(users);

        LoginSystem loginSystem = new LoginSystem(auth);
        loginSystem.login();
	}

}
