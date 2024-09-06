package com.company;

import com.company.model.Person;

public class Main4 {

    public static void main(String[] args) {

        Person person = new Person("Ivan", "Ivanov", 30);
        try {
            person.doSomething();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println(person);
            person.doBeforeDestroy();
            System.out.println(person);
        }

        System.out.println("-".repeat(50));

        try (Person person1 = new Person("Ivan1", "Ivanov", 30);
             Person person2 = new Person("Ivan2", "Ivanov", 30);
             Person person3 = new Person("Ivan3", "Ivanov", 30)){
            person1.doSomething();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
