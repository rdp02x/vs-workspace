import java.sql.SQLException;

public class InsertStatement {
    public InsertStatement()  throws SQLException {

        Conn obj = new Conn();
        String query = String.format("INSERT INTO users(SrNo, Name, Age, City) VALUES (%o, '%s', %o, '%s')", 99, "Prakhar A. Pandya", 20, "Bhavnagar");

        obj.stm = obj.con.createStatement();

        int rowsAffected = obj.stm.executeUpdate(query);
        // The executeUpdate is an different method of the Statement Interface.
        // This method is used when an 'INSERT', 'UPDATE', or 'DELETE' query is used.
        // It returnn the number of row affected after updating the Databases, hence stored in an Integer-Type variable.
        
        if (rowsAffected > 0) {
            System.out.println("Data Inserted Successfully :)");
        } else {
            System.out.println("Data not Inserted :(");
        }

    }
}

