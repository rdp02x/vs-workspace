import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectStatement {
	public SelectStatement() throws SQLException {

		Conn obj = new Conn();
		String query = "SELECT * FROM users";

		obj.stm = obj.con.createStatement();

		ResultSet rs = obj.stm.executeQuery(query);
		// The Statement Interface has a method called executeQuery().
		// Basically, this method executes the SQL query.
		// The ResultSet Interface helps to hold the output received from executing the
		// query.

		while (rs.next())
		// rs.next() methods returns boolean datatype.
		// This check whether the 'rs' has some row present in it or not.
		{
			int id = rs.getInt("SrNo");
			String name = rs.getString("Name");
			int age = rs.getInt("Age");
			String city = rs.getString("City");

			System.out.println(id + " | " + name + " | " + age + " | " + city);
		}

	}
}
