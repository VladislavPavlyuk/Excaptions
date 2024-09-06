package com.company.model;

public class Person implements AutoCloseable
{
    private String name;
    private String lastName;
    private int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public void doBeforeDestroy() {
        name = null;
        lastName = null;
        age = 0;
    }

    public void doSomething() {
        throw new RuntimeException("exception");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void close() throws Exception {
        System.out.println(this);
        name = null;
        lastName = null;
        age = 0;
        System.out.println(this);
    }
}
