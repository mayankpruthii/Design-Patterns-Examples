package Singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // A singleton is called once per service like when the service is instantiated
        // Examples including starting logging service; connection to DB etc 
        // SIMPLE IMPLEMENTATION - instantiate it (lazy instantiation) using private
        // constructor and then can call the instance as and when required
        DateUtil.getInstance();

        /* 
        PROBLEM #1
        If the singleton is serialised and then deserialised in java
        this returns two different objects in ideal case scenario that 
        breaks the singleton principle
        
        SOLUTION - to overcome this we use a special method readResolve() 
        in DateUtil class and return the same object instance        
        */
        DateUtil du1 = DateUtil.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("./dateUtil.ser")));
        oos.writeObject(du1);

        DateUtil du2 = null;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("./dateUtil.ser")));
        du2 = (DateUtil)ois.readObject();

        System.out.println("PROBLEM #1\t" + (du1 == du2));

        /*
        PROBLEM #2
        If the singleton class' constructors are accessed (Reflection problem),
        this might end up in making two different objects
        link - https://www.geeksforgeeks.org/reflection-in-java/
        The hashcode of both objects is different

        SOLUTION - Use enum rather than classes to overcome this problem
        since ENUM doesn't have the concept of reflection api 
        */
        DateUtil instance1 = DateUtil.getInstance();
        DateUtil instance2 = null;
        Constructor[] constructors = DateUtil.class.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            constructor.setAccessible(true);
            try {
                instance2 = (DateUtil) constructor.newInstance();
                break;
            } catch(InstantiationException | IllegalAccessException 
                        | IllegalArgumentException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        System.out.println("PROBLEM #2\t" + (instance1 == instance2));
        // SOLUTION CODE BELOW -
        SingletonENUM enumInstance = SingletonENUM.INSTANCE;
        enumInstance.setName("Mayank");
        System.out.println(enumInstance.getName());
    }
}
