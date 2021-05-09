package DAOExercise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class People {

    private String name;
    private String surname;
    private int age;
    private Address address;

}
