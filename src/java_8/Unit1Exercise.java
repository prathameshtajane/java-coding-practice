package java_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unit1Exercise {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Charles","Dickens",60),
                                            new Person("Lewis","Carroll",42),
                                            new Person("Thomas","Carlyle",51),
                                            new Person("Charlotte","Bronte",45),
                                            new Person("Matthew","Arnold",39));

        //step 1 : Sort list by last name
        System.out.println("step 1");
        Collections.sort(people,(Person p1, Person p2) -> p1.lastname.compareTo(p2.lastname));

        //step 2 : Create a method that prints all elements in the list
        System.out.println("step 2");
//        printAllPeople(people);
        printAllPeopleWithCondition(people,(Person p)->true);


        //step 3 : Create a method that prints all people that have last name beginning with C
        System.out.println("step 3");
        printAllPeopleWithCondition(people,(Person p)->(p.lastname.toLowerCase().charAt(0)=='c'));

    }



    private static void printAllPeopleWithCondition(List<Person> people,Condition condition) {
        for(Person person : people){
            if(condition.test(person))
                System.out.println(person.firstname +" - "+person.lastname+" - "+person.age);
        }
    }

    private static void printAllPeople(List<Person> people) {
        for(Person person : people){
            System.out.println(person.firstname +" - "+person.lastname+" - "+person.age);
        }
    }
}

interface Condition{
    boolean test(Person person);
}

