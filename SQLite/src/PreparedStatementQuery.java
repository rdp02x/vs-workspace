import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementQuery {

    PreparedStatement pstm;

    public PreparedStatementQuery() throws SQLException {

        Conn obj = new Conn();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter SrNo: ");
        int SrNo = sc.nextInt();
        System.out.print("Enter Name: ");
        String Name = sc.nextLine();
        System.out.print("Enter Age: ");
        int Age = sc.nextInt();
        System.out.print("Enter City: ");
        String City = sc.nextLine();

        String query = "INSERT INTO users VALUES(?, ?, ?, ?)";
        obj.pstm = obj.con.prepareStatement(query);
        // Prepared Statement is a method of Statement interface.
        // This is an advance and enhenced version of statement() method.
        // This preparedStatement() method lets java save the memory by executing the precompiled SQL statement.
        // Here, the parameters of the values are replaced by '?'.
        // Till this point in code, the SQL Query is compiled and can be used repeatedly without compiling it again and again.

        pstm.setInt(1, SrNo);
        pstm.setString(2, Name);
        pstm.setInt(3, Age);
        pstm.setString(4, City);
        // We use the 'pstm', the instance of PreparedStatement() method to set the parameter values.
        // We use set() method to set the values.
        // The arguments accepted by set() methods are - Parameter's index and Value.

        int rowsAffected = pstm.executeUpdate();
        // The parameter of executeUpdate() method is blank this time.
        // This is because it generally takes the query as a parameter, but this time the query is already compiled in the beginning.
        
        if (rowsAffected > 0) {
            System.out.println("Data Inserted Successfully :)");            
        } else {
            System.out.println("Data Inserting Failed :(");            
        }

        sc.close();

    }
}