import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
public class CreateDB {

	public static void main(String[] args) {
		Connection c = null;
		Statement stmt = null;
		try {
		
		Class.forName("org.sqlite.JDBC");
    	c = DriverManager.getConnection("jdbc:sqlite:database.db");
    	System.out.println("Database initialized successfully");
    	stmt = c.createStatement();
    	String query = "CREATE TABLE USERS" + "(ID INT PRIMARY KEY	NOT NULL," +
    	"USERNAME		TEXT NOT NULL," + "PASSWORD CHAR 30 NOT NULL)";
    	stmt.executeUpdate(query);
    	stmt.close();
    	c.close();
		}
		catch(Exception e){
			System.err.println( e.getClass().getName() + ": " + e.getMessage());
		}
	}

}
