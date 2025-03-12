import java.sql.Connection;


public interface DatabaseConnection {
	void connect();
	void disconnect();
	
	Connection getConnection(); 
}
