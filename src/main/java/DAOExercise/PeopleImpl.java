package DAOExercise;

import java.sql.SQLException;

import static DAOExercise.DAOPeopleImpl.deleteAll;

public class PeopleImpl {
    public static void main(String[] args) throws Exception {
        deleteAll();
        DAOPeople daoPeople = new DAOPeopleImpl();
        People people1 = new People("Igor","Zadornov",34);
        People people2 = new People("Inokentiy","Solovyev",19);
        People people3 = new People("Andrei","Protopopov",23);
        People people4 = new People("Vladimir","Putin",66);
        People people5 = new People("Sergey","Zdorov",40);
        DAOAddress daoAddress = new DAOAddressImpl();
        Address address1 = new Address("Nezavisimosti", 35);
        Address address2 = new Address("Losika", 9);
        Address address3 = new Address("Sharangovicha", 5);
        Address address4 = new Address("Alibegova", 12);
        Address address5 = new Address("Filimonova", 9);
        daoPeople.create(people1);
        daoPeople.create(people2);
        daoPeople.create(people3);
        daoPeople.create(people4);
        daoPeople.create(people5);
        daoPeople.deleteFirst(people1);
        daoPeople.increaseTwoLast(people1);
        daoAddress.create(address1);
        daoAddress.create(address2);
        daoAddress.create(address3);
        daoAddress.create(address4);
        daoAddress.create(address5);
        daoAddress.increaseTwoLast(address4);
   }
}
