package Reflection.Reflection;

import java.lang.reflect.Method;

public class task72 {
    public static void main(String[] args) {
        MyAcademyInfo my = new MyAcademyInfo();
        Method[] methods = my.getClass().getDeclaredMethods();

        for(Method m:methods) {
            AcademyInfo academyInfo = m.getAnnotation(AcademyInfo.class);
            if (academyInfo !=null)
                System.out.println("Метод " + m.getName() + " аннотирован");
            else System.out.println("Метод " + m.getName() + " не аннотирован");

        }
    }
}
