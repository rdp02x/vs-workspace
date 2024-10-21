import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Conn {
	Connection con;
	Statement stm;
	PreparedStatement pstm;

	public Conn() {
		String url = "jdbc:sqlite:D:/SQL Databases/sample.db";
		// This String is used for accessing the database file.

		try {
			Class.forName("org.sqlite.JDBC");
			// This 'Class' is a part of a parent class called DriverManager Class.
			// This line of code allows the program to connect with the JDBC.

			con = DriverManager.getConnection(url);
			// This getConnection() method is of DriverManager Class.
			// It requires a connection url that helps the program to connect to database.
			// The Connection Interface holds the method getConnection()'s components.

			stm = con.createStatement();
			// The Statement Interface is used to execute SQL Query.
			// The SQL query is executed using the createStatement() method.
			// Now, this method is with Connection class and hence we use its object to
			// access the method.

			// Here, the JDBC Boiler Plate code ends.

			// System.out.println("Conncetion Success!!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

