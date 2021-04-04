package Students_task;

import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
       Stream <Student> student = Stream.of(new Student1("Абдурахман "),
                 new Student1("Инокентий "),new Student1("Володя "),
                 new Student2("Паша "),
                 new Student2("Владлен "), new Student2("Геннадий "),
                 new Student3("Илларион "),new Student3("Севастьян "),
                 new Student3("Данила  "));
                student.forEach(t -> t.getLearnHours(Math.random()));
        }
    }
