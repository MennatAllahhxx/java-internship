import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MySQL mySQL = new MySQL();

        Connection connection = mySQL.connectToDB();

        String tableName = "Employee";

        mySQL.createTable(connection, tableName);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("ahmed", "mohamed", "Male", 30, "alexandria", "0111111111", 7));
        employees.add(new Employee("samy", "mahmoud"));
        employees.add(new Employee("menna", "hassan", "female", 50, "alexandria", "0111111111"));
        employees.add(new Employee("layla", "farouk"));
        employees.add(new Employee("samy", "sayed", "male", 46, "cairo", "0111111222", 15));
        employees.add(new Employee("samir", "ali"));

        mySQL.insertIntoTable(connection, tableName, employees);

        mySQL.updateTable(connection, tableName);
    }
}