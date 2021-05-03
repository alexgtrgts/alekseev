package DAOExercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOPeopleImpl implements DAOPeople{
    private final static String URL = "jdbc:mysql://localhost:3306/People";
    private final static String username = "root";
    private final static String password = "Alex1985.";


    @Override
    public People create(People people) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection conn = DriverManager.getConnection(URL,username,password)) {
            String insertAPerson = "INSERT INTO dao.people(name,surname,age) VALUES (?,?,?)";
            PreparedStatement prepStatement = conn.prepareStatement(insertAPerson);
            prepStatement.setString(1, people.getName());
            prepStatement.setString(2,people.getSurname());
            prepStatement.setInt(3,people.getAge());
            prepStatement.executeUpdate();

        } catch( SQLException e) {
            e.printStackTrace();
        } return people;
    }

    @Override
    public People increaseTwoLast(People people) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection conn = DriverManager.getConnection(URL,username,password)) {
            String increaseTwoLast = "UPDATE dao.people SET age = age+1 WHERE id =4 AND id =5";
        PreparedStatement preparedStatement = conn.prepareStatement(increaseTwoLast);
        preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return people;
    }

    @Override
    public People deleteFirst(People people) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection conn = DriverManager.getConnection(URL,username,password)) {
            String deleteFirst = "DELETE FROM dao.people WHERE id =1";
            PreparedStatement preparedStatement = conn.prepareStatement(deleteFirst);
            preparedStatement.executeUpdate();
        }
        return people;
    }

    public static void deleteAll() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection conn = DriverManager.getConnection(URL, username, password)) {
            String deleteAll = "DELETE FROM dao.people";
            PreparedStatement preparedStatement = conn.prepareStatement(deleteAll);
            preparedStatement.executeUpdate();
        }
    }
}
