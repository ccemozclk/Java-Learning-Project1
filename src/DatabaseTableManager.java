import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class DatabaseTableManager {
	private final DatabaseConnection dbConnection;
	public DatabaseTableManager(DatabaseConnection dbConnection) {
		this.dbConnection = dbConnection;
	}
	public void creatNewTable (String tableName, String columns) {
		String createTableSQL = String.format("CREATE TABLE IF NOT EXISTS %s (%s);", tableName, columns);
		try {
			dbConnection.connect();
			Connection connection = ((PostgreDatabaseConnection) dbConnection).getConnection();
			Statement statement = connection.createStatement();
			statement.execute(createTableSQL);
			System.out.println(tableName + " Table has Created !! ");
		} catch (SQLException e) {
			System.err.println("Error creating table:" + e.getMessage());
		} finally {
			dbConnection.disconnect();
		}
	}
	public void insertTable(String tableName, List<String> columns, List<String> values) {
		if (columns.size() != values.size()) {
			throw new IllegalArgumentException("The number of columns and the number of values ​​do not match!");
		} 
		String columnNames = String.join(", ", columns);
		String questionMarks = String.join(", ", "?".repeat(values.size()).split(""));
		String insertSQL = String.format("INSERT INTO %s (%s) VALUES (%s)", tableName, columnNames, questionMarks);
		try {
			dbConnection.connect();
			Connection connection = dbConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
			for (int i = 0; i < values.size(); i++) {
				preparedStatement.setString(i+1, values.get(i));
			}
			
			int rowsAffected = preparedStatement.executeUpdate();
			if (rowsAffected>0) {
				System.out.println("Data was successfully added to " + tableName);
			}
			
		} catch (SQLException e) {
			System.err.println("Error while adding data: " + e.getMessage());
		} finally {
			dbConnection.disconnect();
		}
	}
}
