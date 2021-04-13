package aleks;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) throws IOException {
        List<Person> listofPersons = new ArrayList<>();
        Set setofPersons = new HashSet<>();
        File file = new File("D:\\Учеба\\PersonTask\\PersonTask.txt");
        file.createNewFile();

        Person person1 = new Person("IVAn", "Kozlov", 25);
        Person person2 = new Person("Oleg", "Baranov", 16);
        Person person3 = new Person("Andrei", "Idiotov", 20);
        Person person4 = new Person("Ilya", "Mudakov", 19);
        Person person5 = new Person("Petr", "Upyrev", 18);
        Person person6 = new Person("Petr", "Aypyrev", 17);
        Person person7 = new Person("Petr", "Upyrev", 18);


//        //Генерация Personov
//        for (int i=0;i<5;i++) {
            listofPersons.add(person1);
            listofPersons.add(person2);
            listofPersons.add(person3);
            listofPersons.add(person4);
            listofPersons.add(person5);
            listofPersons.add(person6);
            listofPersons.add(person7);


        //1+2: с возрастом меньше 21 + распечатка
        for(int i=0;i< listofPersons.size();i++) {
            if (listofPersons.get(i).getAge() < 21) {
                System.out.println(listofPersons.get(i));
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
        for (int i=0; i<listofPersons.size(); i++) {
            setofPersons.add(listofPersons.get(i));
        }
        Iterator<Person> iter = setofPersons.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        //5 сохраняем в файл
        try (ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("D:\\Учеба\\PersonTask\\PersonTask.txt"))){
            Iterator<Person> iterator = setofPersons.iterator();
            while (iterator.hasNext()) {
                ous.writeObject(iterator.next());
            }
        } catch (IOException e) {e.printStackTrace();}

        //6 читаем из файла + 7 создаем коллекция из стрингов из Имени и фамии и печатаем
        System.out.println();
        System.out.println("Читаем из файла + печатам коллекцию из имен и фамилий__________________________________");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Учеба\\PersonTask\\PersonTask.txt"))) {
            List<Person> listOfPersonsReadFromFile = new ArrayList<>();
            List<String> listOfNamesAndSurnames = new ArrayList<>();
            for (int i=0; i< setofPersons.size(); i++) {
                listOfPersonsReadFromFile.add((Person) ois.readObject());
                //System.out.println(listOfPersonsReadFromFile.get(i));
            }
            for (int j=0; j<listOfPersonsReadFromFile.size();j++) {
                listOfNamesAndSurnames.add(listOfPersonsReadFromFile.get(j).getName());
                listOfNamesAndSurnames.add(listOfPersonsReadFromFile.get(j).getSurname());
            }
            listOfNamesAndSurnames.forEach(System.out::println);
        } catch (IOException | ClassNotFoundException e) { e.printStackTrace();}
    }
}
