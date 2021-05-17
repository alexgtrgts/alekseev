package DAOExercise;

import DAOExercise.pojos.Address;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOAddressImpl implements DAOAddress {

    private final static String URL = "jdbc:mysql://localhost:3306/People";
    private final static String username = "root";
    private final static String password = "Alex1985.";

//    @Override
//    public Address create(Address address) throws SQLException, ClassNotFoundException {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        try(Connection conn = DriverManager.getConnection(URL,username,password)) {
//            String insertAnAddress = "INSERT INTO dao.address(street,house) VALUES (?,?)";
//            PreparedStatement prepStatAddress = conn.prepareStatement(insertAnAddress);
//            prepStatAddress.setString(1,address.getStreet());
//            prepStatAddress.setInt(2,address.getHouse());
//            prepStatAddress.executeUpdate();
//        } catch( SQLException e) {
//            e.printStackTrace();
//        } return address;
//    }

    @Override
    public Address increaseTwoLast(Address address) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection conn = DriverManager.getConnection(URL,username,password)) {
            String increaseTwoLast = "UPDATE dao.address SET house = house+1 WHERE id =4 AND id =5";
            PreparedStatement preparedStatement = conn.prepareStatement(increaseTwoLast);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return address;
    }

    @Override
    public Address deleteFirst(Address address) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection conn = DriverManager.getConnection(URL,username,password)) {
            String deleteFirst = "DELETE FROM dao.address WHERE id =1";
            PreparedStatement preparedStatement = conn.prepareStatement(deleteFirst);
            preparedStatement.executeUpdate();
        }
        return address;
    }
}
