package com.pluralsight;

public class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person otherPerson){

            int lastNameCompare = this.lastName.compareTo(otherPerson.lastName);

            if(lastNameCompare != 0) {
                return lastNameCompare;
            }

        return this.firstName.compareTo(otherPerson.firstName);
    }

    @Override
    public String toString(){
        return firstName + " " + lastName + "Age: " + age + "\n";
    }
}
