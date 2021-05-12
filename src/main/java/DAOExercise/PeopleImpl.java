package DAOExercise;

import java.sql.*;

import static DAOExercise.DAOPeopleImpl.deleteAll;

public class PeopleImpl {
    public static void main(String[] args) throws Exception {
        final String URL = "jdbc:mysql://localhost:3306/People";
        final String username = "root";
        final String password = "Alex1985.";
        deleteAll();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL,username,password);
            Statement stmt = conn.createStatement();
            conn.setAutoCommit(false);
            stmt.executeUpdate("INSERT into dao.people(name,surname,age) VALUES('Igor','Zadornov',32)");
            stmt.executeUpdate("INSERT into dao.people(name,surname,age) VALUES('Oleg','Lomovoi',19)");
            stmt.executeUpdate("INSERT into dao.people(name,surname,age) VALUES('Andrei','Alekseev',35)");
            stmt.executeUpdate("INSERT into dao.people(name,surname,age) VALUES('Grigorii','Jarko',25)");
            stmt.executeUpdate("INSERT into dao.people(name,surname,age) VALUES('Misha','Vorobyev',29)");
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback();
        }

        try (Connection conn1 = DriverManager.getConnection(URL,username,password);){
            Statement statement = conn1.createStatement();
            conn1.setAutoCommit(false);
            statement.addBatch("INSERT into dao.address(street,house) VALUES('Ignatovskogo',1)");
            statement.addBatch("INSERT into dao.address(street,house) VALUES('Nezavisimosti',202)");
            statement.addBatch("INSERT into dao.address(street,house) VALUES('Alibegova',12)");
            statement.addBatch("INSERT into dao.address(street,house) VALUES('Schkolnaya',16)");
            statement.addBatch("INSERT into dao.address(street,house) VALUES('Sharangovicha',66)");
            int[] x = statement.executeBatch();
            conn1.commit();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
   }
}
