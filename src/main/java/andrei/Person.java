package andrei;

    /*
    Делаем в maven покрываем unit test-ами
Создайте класс Person, с полями ИЗ ЗАДАЧИ  13,04,2021 Практическая часть (-id,  age, salary, passport, address,
dateOfBirthday, dateTimeCreate, timeToLunch, letter). Сгенерируйте группу из 100 человек в возрасте от 15 до 30.
1) выберете объекты, возраст которых меньше 21;
2) распечатать их на экран;
 3) сортируем по фамилии, а потом по имени (использовать thenComparing у объекта Comparator);
 4) убираем дубли (если name, surname, age одинаковые)
 5) сохраняем в файл, как объект, каждый экземпляр класса Person
6) читаем из файла
7) создаем при помощи потока новую коллекцию (List<String>) только из Фамилии и Имени для прочтенных из фалов объектов
8) выводим на экран
9) для вывода на экран используем (ResourceBundle)
10) СОХРАНИТЬ  В БАЗУ ДАННЫХ каждый экземпляр класса Person
11) ПРОЧЕСТЬ ИЗ БАЗЫ ДАННЫХ экземпляры класса Person и повторить пункты 7, 8, 9
*/

import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private String surname;
    private int ID;
    private int age;
    private int salary;
    private String passport;
    private String address;
    private String dateOfBirthday;
    private String dateTimeCreate;
    private String timeToLunch;
    private String letter;

    Person(PersonBuilder builder) {
        this.name = builder.getName();
        this.surname = builder.getSurname();
        this.ID = builder.getID();
        this.age = builder.getAge();
        this.salary = builder.getSalary();
        this.passport = builder.getPassport();
        this.address = builder.getAddress();
        this.dateOfBirthday = builder.getDateOfBirthday();
        this.dateTimeCreate = builder.getDateTimeCreate();
        this.timeToLunch = builder.getTimeToLunch();
        this.letter = builder.getLetter();
    }

    public int getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getPassport() {
        return passport;
    }

    public String getAddress() {
        return address;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public String getDateTimeCreate() {
        return dateTimeCreate;
    }

    public String getTimeToLunch() {
        return timeToLunch;
    }

    public String getLetter() {
        return letter;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", ID=" + ID +
                ", age=" + age +
                ", salary=" + salary +
                ", passport='" + passport + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirthday='" + dateOfBirthday + '\'' +
                ", dateTimeCreate='" + dateTimeCreate + '\'' +
                ", timeToLunch='" + timeToLunch + '\'' +
                ", letter='" + letter + '\'' +
                '}';
    }
}
