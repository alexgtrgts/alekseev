package DAOExercise;

import java.io.Serializable;
import java.sql.SQLException;

public interface DAO<T> {

    public T create(T t) throws SQLException, ClassNotFoundException, Exception;
    public T increaseTwoLast(T t) throws SQLException, ClassNotFoundException;
    public T deleteFirst (T t) throws SQLException, ClassNotFoundException;


}
