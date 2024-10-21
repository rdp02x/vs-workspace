// import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TwoTablesEntry {
    Conn c = new Conn();

    // PreparedStatement pstm;

    public TwoTablesEntry() throws SQLException {

        Conn obj = new Conn();
        Scanner sc = new Scanner(System.in);

        // Table 1 data
        // System.out.print("Enter SrNo: ");
        // int SrNo = sc.nextInt();
        // System.out.print("Enter Name: ");
        // String Name = sc.next();
        // System.out.print("Enter Age: ");
        // int Age = sc.nextInt();
        // System.out.print("Enter City: ");
        // String City = sc.next();

        // Table 2 data
        System.out.print("Enter Height: ");
        double height = sc.nextDouble();
        System.out.print("Enter Weight: ");
        double weight = sc.nextDouble();
        
        double BMI = (weight / height / height) * 10000;

        int height1 = (int)height;
        int weight1 = (int)weight;
  
        // int roundedHeight = Integer.parseInt(height);
        // int roundedWeight = Integer.parseInt(weight);

        // String query1= "INSERT INTO users VALUES(?, ?, ?, ?)";
        // obj.pstm = obj.con.prepareStatement(query1);
        // obj.pstm.setInt(1, SrNo);
        // obj.pstm.setString(2, Name);
        // obj.pstm.setInt(3, Age);
        // obj.pstm.setString(4, City);

        // int rowsAffected1 = obj.pstm.executeUpdate();

        String query2 = "INSERT INTO meow VALUES(?, ?, ?)";
        obj.pstm = obj.con.prepareStatement(query2);
        obj.pstm.setInt(1,height1);
        obj.pstm.setInt(2,weight1);
        obj.pstm.setDouble(3, BMI);

        int rowsAffected2 = obj.pstm.executeUpdate();
        // The parameter of executeUpdate() method is blank this time.
        // This is because it generally takes the query as a parameter, but this time the query is already compiled in the beginning.
        
        if (rowsAffected2 > 0) {
            System.out.println("Data Inserted Successfully :)");            
        } else {
            System.out.println("Data Inserting Failed :(");            
        }

        sc.close();
    }
}
