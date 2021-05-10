package DAOExercise;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor


public class People {

    private String name;
    private String surname;
    private int age;
    private Address address;


}
