import java.sql.*;
import java.util.List;

public class MySQL {
    private String dbURL;
    private String username;
    private String password;
    private String message;
    private String sqlStatement;

    public String getDbURL() {
        return dbURL;
    }

    public void setDbURL(String dbURL) {
        this.dbURL = dbURL;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSqlStatement() {
        return sqlStatement;
    }

    public void setSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
    }

    public Connection connectToDB() {
        Connection connection = null;
        try {
            setDbURL("jdbc:mysql://127.0.0.1:3306/person");
            setUsername("root");
            setPassword("betty");
            connection = DriverManager.getConnection(getDbURL(), getUsername(), getPassword());
            setMessage("Connected to the database successfully");

        } catch (SQLException e) {
            e.printStackTrace();
            setMessage("failed to connect to the database");
        }

        System.out.println(getMessage());
        return connection;
    }

    public void createTable(Connection connection, String tableName) {
        setSqlStatement("CREATE TABLE " + tableName +" (" +
                "Id int NOT NULL AUTO_INCREMENT, " +
                "F_Name varchar(100) NOT NULL, " +
                "L_Name varchar(100) NOT NULL, " +
                "Sex varchar(50), " +
                "Age int, " +
                "Address varchar(255), " +
                "Phone_Number varchar(255), " +
                "Vacation_Balance int DEFAULT 30, " +
                "PRIMARY KEY (Id));");
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(getSqlStatement());

            setMessage("Table created successfully");
        } catch (SQLException e) {
            e.printStackTrace();
            setMessage("Error creating the table");
        }

        System.out.println(getMessage());
    }

    public void insertIntoTable(Connection connection, String tableName, List<Employee> employees) {
        setSqlStatement("INSERT INTO " + tableName +
                "(F_Name, L_Name, Sex, Age, Address, Phone_Number, Vacation_Balance) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?);");

        try {
            PreparedStatement preparedStatement;

            for(Employee employee:employees){
                setMessage("");
                preparedStatement = connection.prepareStatement(getSqlStatement());
                if(employee.getSex() == null) {
                    preparedStatement.setString(1, employee.getFirstName());
                    preparedStatement.setString(2, employee.getLastName());
                    preparedStatement.setNull(3, Types.VARCHAR);
                    preparedStatement.setNull(4, Types.INTEGER);
                    preparedStatement.setNull(5, Types.VARCHAR);
                    preparedStatement.setNull(6, Types.VARCHAR);
                    preparedStatement.setInt(7, 30);
                    setMessage("Employee added successfully");
                } else if (employee.getVacationBalance() == -1){
                    preparedStatement.setString(1, employee.getFirstName());
                    preparedStatement.setString(2, employee.getLastName());
                    preparedStatement.setString(3, employee.getSex());
                    preparedStatement.setInt(4, employee.getAge());
                    preparedStatement.setString(5, employee.getAddress());
                    preparedStatement.setString(6, employee.getPhoneNumber());
                    preparedStatement.setInt(7, 30);
                    setMessage("Employee added successfully");
                } else {
                    preparedStatement.setString(1, employee.getFirstName());
                    preparedStatement.setString(2, employee.getLastName());
                    preparedStatement.setString(3, employee.getSex());
                    preparedStatement.setInt(4, employee.getAge());
                    preparedStatement.setString(5, employee.getAddress());
                    preparedStatement.setString(6, employee.getPhoneNumber());
                    preparedStatement.setInt(7, employee.getVacationBalance());
                    setMessage("Employee added successfully");
                }
                if (getMessage().equals("Employee added successfully"))
                {
                    preparedStatement.executeUpdate();
                    System.out.println(getMessage());
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            setMessage("Error adding the employee");
            System.out.println(getMessage());
        }
    }
}