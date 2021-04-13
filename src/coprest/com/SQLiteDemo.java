package coprest.com;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLiteDemo {

	public static void main(String[] args) {
String jdbcUrl = "jdbc:sqlite:/C:\\sqlite3\\users.db";
try {
Connection connection = DriverManager.getConnection(jdbcUrl);
String sql = "SELECT * FROM users";
Statement statement = (Statement) connection.createStatement();
ResultSet resut = ((java.sql.Statement) statement).executeQuery(sql);
while (resut.next()) {
	String name = resut.getString("name");
	String prenom = resut.getString("prenom");
	String email = resut.getString("email");
	System.out.print(name + "|" +prenom  +email);
}
}catch (SQLException e) {
		System.out.println("Error connecting to Sqlite database ");
		e.printStackTrace();
	}
	}

}
