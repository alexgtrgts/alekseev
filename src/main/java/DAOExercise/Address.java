package DAOExercise;

import java.util.Objects;

public class Address {

    private String street;
    private int house;

    public Address(String street, int house) {
        this.street = street;
        this.house = house;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", house=" + house +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return house == address.house && Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, house);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }
}
