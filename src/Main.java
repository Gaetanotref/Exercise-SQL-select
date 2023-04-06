import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
        public static void main(String[] args) {

            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "developer", "developer");
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from test1");
                List<String> surname = new ArrayList<>();
                while (resultSet.next()) {
                    System.out.println(resultSet.getString("name"));

                    surname.add(resultSet.getString("surname"));

                }
                System.out.println(surname);
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}