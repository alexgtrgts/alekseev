package Reflection.Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task71 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        ToTask71 task71 = new ToTask71();
        try {
            Method m = task71.getClass().getDeclaredMethod("HelloWorld", null);
            m.invoke(task71,null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}
