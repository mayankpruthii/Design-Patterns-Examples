package Annotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    
    /**
     * Reference of this Annotation is from https://youtu.be/DkZr7_c9ry8
     */
    public static void main(String args[])
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

        // example of an inbuilt annotation -->
        // @SuppressWarnings("unused")
        Cat myCat = new Cat("kitty", 2);

        if (myCat.getClass().isAnnotationPresent(VeryImportant.class)) {
            // this will execute
            System.out.println("This thing is very important");
        } else {
            System.out.println("This thing is not very important");
        }

        for (Method method : myCat.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(RunImmediately.class)) {
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                for (int i = 0; i < annotation.times(); i++) {
                    method.invoke(myCat);
                }
            }
        }

        for (Field field : myCat.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(ImportantString.class)) {
                Object objectValue = field.get(myCat);
                if (objectValue instanceof String stringValue) {
                    System.out.println(stringValue);
                }
            }
        }
    }
}
