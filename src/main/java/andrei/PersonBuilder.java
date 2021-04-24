package andrei;

public class PersonBuilder {

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

    public  PersonBuilder Name(String name) {
        this.name = name;
        return this;
    }

    public  PersonBuilder Surname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder ID(int ID) {
        this.ID = ID;
        return  this;
    }

    public PersonBuilder age(int age) {
        this.age = age;
        return  this;
    }

    public PersonBuilder salary(int salary) {
        this.salary = salary;
        return  this;
    }

    public PersonBuilder passport(String passport) {
        this.passport = passport;
        return  this;
    }

    public PersonBuilder address(String address) {
        this.address = address;
        return  this;
    }

    public PersonBuilder dateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
        return  this;
    }

    public PersonBuilder dateTimeCreate(String dateTimeCreate) {
        this.dateTimeCreate = dateTimeCreate;
        return  this;
    }

    public PersonBuilder timeToLunch(String timeToLunch) {
        this.timeToLunch = timeToLunch;
        return  this;
    }

    public PersonBuilder letter(String letter) {
        this.letter = letter;
        return  this;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
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

    public Person build() {
        return new Person(this);
    }
}
