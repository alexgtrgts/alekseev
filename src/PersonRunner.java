public class PersonRunner {

    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .name("Aleh")
                .surname("Voronov")
                .age(35)
                .build();

    }
}
