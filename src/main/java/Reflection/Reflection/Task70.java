package Reflection.Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task70 {
    public static void main(String[] args) {
        Man newMan = new Man();
        try {
            Method method = newMan.getClass().getDeclaredMethod("getAllInfo", Man.class);
            method.invoke(newMan,newMan);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            System.out.println("No such method found");
        }
    }


}
