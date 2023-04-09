package Annotations;

import java.util.Objects;

@VeryImportant
public class Cat {
    
    @ImportantString
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @RunImmediately(times=3)
    public void meow() {
        System.out.println("Meow");
    }

    @RunImmediately
    public void purr() {
        System.out.println("Purr");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cat)) {
            return false;
        }
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name) && age == cat.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
   
}
