package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// specify where the annotation will be used eg. class, methods
@Target({ElementType.TYPE, ElementType.METHOD}) 
// check RetentionPolicy for better understanding
@Retention(RetentionPolicy.RUNTIME)
public @interface VeryImportant {
    
}
