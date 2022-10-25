package Singleton;

import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable {
    
    // Volatile keyword is used to modify the value of a variable 
    // by different threads. It is also used to make classes thread 
    // safe. It means that multiple threads can use a method and 
    // instance of the classes at the same time without any problem. 
    // The volatile keyword can be used either with primitive type or objects.
    // https://www.javatpoint.com/volatile-keyword-in-java
    private static volatile DateUtil instance;

    private DateUtil() {}

    public static DateUtil getInstance() {
        if(instance == null) {
            // ensures that singleton is thread safe
            // such that 
            synchronized(DateUtil.class) {
                if(instance == null) {
                    DateUtil.instance = new DateUtil();
                }    
            }
        }
        return DateUtil.instance;
    }

    // readResolve is used for replacing the object read from the 
    // stream. The only use I've ever seen for this is enforcing 
    // singletons; when an object is read, replace it with the singleton 
    // instance. This ensures that nobody can create another instance 
    // by serializing and deserializing the singleton.
    // https://stackoverflow.com/questions/1168348/java-serialization-readobject-vs-readresolve
    protected Object readResolve() {
        return DateUtil.instance;
    }

    // ensures the singleton class cannot be cloned
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
