package andrei;

import java.io.*;
import java.sql.*;
import java.util.*;


public class Runner {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Person> listofPersons = new ArrayList<>();
        Set setofPersons = new HashSet<>();
        File file = new File("D:\\Учеба\\aleks\\PersonSQL.txt");
        file.createNewFile();

        Person person1 = new PersonBuilder().Name("John").Surname("Doe").ID(1).age(35).salary(500)
                .passport("MA111111").address("220078,Skryganova 218, 354").dateOfBirthday("17.06.1985")
                .dateTimeCreate("01.01.2020").timeToLunch("12.00").letter("хороший").build();

        Person person2 = new PersonBuilder().Name("Mike").Surname("Smith").ID(2).age(19).salary(1000)
                .passport("MБ111111").address("220112,Prychynskih 56, 19").dateOfBirthday("09.12.2002")
                .dateTimeCreate("02.01.2018").timeToLunch("12.30").letter("прилежный").build();

        Person person3 = new PersonBuilder().Name("Sally").Surname("McCarthy").ID(3).age(20).salary(400).
                passport("MB111111").address("220000,Nezavisimosti 1, 1").dateOfBirthday("25.03.2001")
                .dateTimeCreate("17.03.2005").timeToLunch("13.00").letter("удачливый").build();

        Person person4 = new PersonBuilder().Name("Peter").Surname("Work").ID(4).age(18).salary(300).
                passport("MГ111111").address("220000,Prityckogo 5, 18").dateOfBirthday("14.03.2003")
                .dateTimeCreate("14.06.2010").timeToLunch("13.30").letter("исполнительный").build();

        Person person5 = new PersonBuilder().Name("Jeff").Surname("Bridges").ID(5).age(31).salary(900).
                passport("MД111111").address("220000,Nezavisimosti 1, 1").dateOfBirthday("25.03.1990")
                .dateTimeCreate("25.01.2007").timeToLunch("11.00").letter("веселый").build();

        Person person6 = new PersonBuilder().Name("Oskar").Surname("While").ID(6).age(16).salary(100).
                passport("MЕ111111").address("220001,Promyschlennaya 5, 15").dateOfBirthday("20.08.2005").
                dateTimeCreate("08.10.2013").timeToLunch("11.30").letter("грустный").build();

        Person person7 = new PersonBuilder().Name("Justin").Surname("Beeber").ID(7).age(40).salary(5000).
                passport("MЖ111111").address("220011,Mayakovskogo 135, 27").dateOfBirthday("22.05.1981").
                dateTimeCreate("01.06.2015").timeToLunch("14.00").letter("радостный").build();

        Person person8 = new PersonBuilder().Name("Robert").Surname("Miles").ID(8).age(15).salary(0).
                passport("MЗ111111").address("220013,Schkolnaya 17, 16").dateOfBirthday("12.10.2005").
                dateTimeCreate("01.11.2009").timeToLunch("14.30").letter("замкнутый").build();

        Person person9 = new PersonBuilder().Name("Patrick").Surname("Moore").ID(9).age(50).salary(3000).
                passport("MИ111111").address("220078,Alibegova 10, 155").dateOfBirthday("24.07.1960").
                dateTimeCreate("16.12.2016").timeToLunch("15.00").letter("прямой").build();

        Person person10 = new PersonBuilder().Name("Ted").Surname("Wilson").ID(10).age(28).salary(2000).
                passport("MЛ111111").address("220015,Dzerjinskogo 12, 43").dateOfBirthday("12.01.1993").
                dateTimeCreate("15.08.2000").timeToLunch("15.30").letter("смелый").build();


        listofPersons.add(person1);
        listofPersons.add(person2);
        listofPersons.add(person3);
        listofPersons.add(person4);
        listofPersons.add(person5);
        listofPersons.add(person6);
        listofPersons.add(person7);
        listofPersons.add(person8);
        listofPersons.add(person9);
        listofPersons.add(person10);


        //1+2: с возрастом меньше 21 + распечатка
        for (int i = 0; i < listofPersons.size(); i++) {
            if (listofPersons.get(i).getAge() < 21) {
                System.out.print(" " + listofPersons.get(i));
//                System.out.print(" " +listofPersons.get(i).getSurname());
//                System.out.print(" " +listofPersons.get(i).getID());
//                System.out.print(" " +listofPersons.get(i).getAge());
//                System.out.print(" " +listofPersons.get(i).getSalary());
//                System.out.print(" " +listofPersons.get(i).getPassport());
//                System.out.print(" " +listofPersons.get(i).getAddress());
//                System.out.print(" " +listofPersons.get(i).getDateOfBirthday());
//                System.out.print(" " +listofPersons.get(i).getDateTimeCreate());
//                System.out.print(" " +listofPersons.get(i).getTimeToLunch());
//                System.out.print(" " +listofPersons.get(i).getLetter());
                System.out.println();
            } else {
                listofPersons.remove(i);
                i--;
            }
        }

        //3 сорт по фамилии,а потом по имени
        System.out.println("3_________________________________________________________________________");
        listofPersons.sort(Comparator.comparing(Person::getSurname).thenComparing(Person::getName));


        // 4 убираем дубли
        System.out.println("4_________________________________________________________________________");
        for (int i = 0; i < listofPersons.size(); i++) {
            setofPersons.add(listofPersons.get(i));
        }
        Iterator<Person> iter = setofPersons.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        //5 сохраняем в файл
        try (ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("D:\\Учеба\\aleks\\PersonSQL.txt"))) {
            Iterator<Person> iterator = setofPersons.iterator();
            while (iterator.hasNext()) {
                ous.writeObject(iterator.next());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //6 читаем из файла + 7 создаем коллекция из стрингов из Имени и фамии и 8 печатаем
        System.out.println();
        System.out.println("Читаем из файла + печатам коллекцию из имен и фамилий__________________________________");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Учеба\\aleks\\PersonSQL.txt"))) {
            List<Person> listOfPersonsReadFromFile = new ArrayList<>();
            List<String> listOfNamesAndSurnames = new ArrayList<>();
            for (int i = 0; i < setofPersons.size(); i++) {
                listOfPersonsReadFromFile.add((Person) ois.readObject());
                //System.out.println(listOfPersonsReadFromFile.get(i));
            }
            for (int j = 0; j < listOfPersonsReadFromFile.size(); j++) {
                listOfNamesAndSurnames.add(listOfPersonsReadFromFile.get(j).getName());
                listOfNamesAndSurnames.add(listOfPersonsReadFromFile.get(j).getSurname());
            }
            listOfNamesAndSurnames.forEach(System.out::println);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            String username = "root";
            String password = "Alex1985.";
            String URl = "jdbc:mysql://localhost:3306/personinfo";
            writePersons(URl,username,password);
            readPersons(URl,username,password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void writePersons(String URl,String username, String password) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(URl, username, password);
        Statement statement = conn.createStatement();
        statement.execute("CREATE TABLE if not exists personinfo(name varchar(50),surname varchar(100),ID int," +
                "age int,salary int,passport varchar(100),address varchar(100),dateOfBirthday varchar(100),dateTimeCreate" +
                " varchar(100),timeToLunch varchar(10),letter varchar(100))");
        statement.execute("DELETE FROM personinfo");
        statement.execute("INSERT INTO personinfo(name,surname,ID,age,salary," +
                "passport,address,dateOfBirthday,dateTimeCreate,timeToLunch," +
                "letter) VALUES ('John','Doe',1,35,500,'MA111111','220078,Skryganova 218, 354'," +
                "'17.06.1985','01.01.2020','12.00','хороший')");
//
        statement.execute("INSERT INTO personinfo(name,surname,ID,age,salary," +
                "passport,address,dateOfBirthday,dateTimeCreate,timeToLunch," +
                "letter) VALUES ('Mike','Smith',2,19,1000,'MБ111111','220112,Prychynskih 56, 19'," +
                "'09.12.2002','02.01.2018','12.30','прилежный')");

        statement.execute("INSERT INTO personinfo(name,surname,ID,age,salary," +
                "passport,address,dateOfBirthday,dateTimeCreate,timeToLunch," +
                "letter) VALUES ('Sally','McCarthy',3,20,400,'MВ111111','220000,Nezavisimosti 1, 1'," +
                "'25.03.2001','17.03.2005','13.00','удачливый')");

        statement.execute("INSERT INTO personinfo(name,surname,ID,age,salary," +
                "passport,address,dateOfBirthday,dateTimeCreate,timeToLunch," +
                "letter) VALUES ('Peter','Work',4,18,300,'MГ111111','220000,Prityckogo 5, 18'," +
                "'14.03.2003','14.06.2010','13.30','исполнительный')");

        statement.execute("INSERT INTO personinfo(name,surname,ID,age,salary," +
                "passport,address,dateOfBirthday,dateTimeCreate,timeToLunch," +
                "letter) VALUES ('Jeff','Bridges',5,31,900,'MД111111','220000,Nezavisimosti 1, 1'," +
                "'25.03.1990','25.01.2007','11.00','веселый')");

        statement.execute("INSERT INTO personinfo(name,surname,ID,age,salary," +
                "passport,address,dateOfBirthday,dateTimeCreate,timeToLunch," +
                "letter) VALUES ('Oskar','While',6,16,100,'MЕ111111','220001,Promyschlennaya 5, 15'," +
                "'20.08.2005','08.10.2013','11.30','грустный')");

        statement.execute("INSERT INTO personinfo(name,surname,ID,age,salary," +
                "passport,address,dateOfBirthday,dateTimeCreate,timeToLunch," +
                "letter) VALUES ('Justin','Beeber',7,40,5000,'MЖ111111','220011,Mayakovskogo 135, 27'," +
                "'22.05.1981','01.06.2015','14.00','радостный')");

        statement.execute("INSERT INTO personinfo(name,surname,ID,age,salary," +
                "passport,address,dateOfBirthday,dateTimeCreate,timeToLunch," +
                "letter) VALUES ('Robert','Miles',8,15,1000,'MЗ111111','220013,Schkolnaya 17, 16'," +
                "'12.10.2005','01.11.2009','14.30','замкнутый')");

        statement.execute("INSERT INTO personinfo(name,surname,ID,age,salary," +
                "passport,address,dateOfBirthday,dateTimeCreate,timeToLunch," +
                "letter) VALUES ('Patrick','Moore',9,50,3000,'MИ111111','220078,Alibegova 10, 155'," +
                "'24.07.1960','16.12.2016','15.00','прямой')");

        statement.execute("INSERT INTO personinfo(name,surname,ID,age,salary," +
                "passport,address,dateOfBirthday,dateTimeCreate,timeToLunch," +
                "letter) VALUES ('Ted','Wilson',10,28,2000,'MЛ111111','220015,Dzerjinskogo 12, 43'," +
                "'12.01.1993','15.08.2000','15.30','смелый')");
    }

    public static void readPersons(String URl,String  username,String password) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(URl, username, password);
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * from personinfo.personinfo");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
            System.out.println(resultSet.getString("surname"));
        }
    }
}
