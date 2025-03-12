import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class PostgreDatabaseConnection implements DatabaseConnection {
	private static final String URL = "jdbc:postgresql://localhost:5432/CemDB";
	private static final String USER = "FakeUser";
    private static final String PASSWORD = "FakePassword";
    private Connection connection;

    
    @Override
    public void connect() {
    	try {
    		connection = DriverManager.getConnection(URL, USER, PASSWORD);
    		System.out.println("PostgreSQL Connection is Successfull !");
    	} catch (SQLException e) {
    		System.err.println("PostgreSQL Connection is Unsuccessfull !" + e.getMessage());
    	}
    }
    
    
    @Override 
    public void disconnect() {
    	try {
    		if (connection != null && !connection.isClosed()) {
    			connection.close();
    			System.out.println("PostgreSQL Connection has closed !");
    		}
    	} catch (SQLException e) {
    		System.err.println("Connection closing error:" + e.getMessage());
    	}
    }
    
  
    public Connection getConnection() {
        return connection;
    }
}
