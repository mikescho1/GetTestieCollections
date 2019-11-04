package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {


    @Test
    public void linkedListTest1() {
        Person person = new Person("Frank", 1985);
        Person person1 = new Person("Barney", 1900);
        Person person2 = new Person("Fred", 1901);
        Person person3 = new Person("Mac", 2005);

        LinkedList<Person> linkedList = new LinkedList<Person>();

        linkedList.add(person);
        linkedList.add(person1);
        linkedList.add(person2);
        linkedList.add(person3);



        int expectedInt = 4;
        int actualInt = linkedList.size();

        boolean expectedBool = true;
        boolean actualBool = linkedList.contains(person2);

        Assert.assertEquals(expectedInt, actualInt);
        Assert.assertEquals(expectedBool, actualBool);
    }

    @Test
    public void linkedListTest2() {
        Person person = new Person("Frank", 1985);
        Person person1 = new Person("Barney", 1900);
        Person person2 = new Person("Fred", 1901);
        Person person3 = new Person("Mac", 2005);

        LinkedList<Person> linkedList = new LinkedList<Person>();

        linkedList.add(0, person);
        System.out.println(linkedList);
        linkedList.add(1, person1);
        System.out.println(linkedList);
        linkedList.add(2, person2);
        System.out.println(linkedList);
        linkedList.add(3, person3);
        System.out.println(linkedList);
        linkedList.add(2, person);  //inserts object and pushes existing object to next element. Does not replace it.
        System.out.println(linkedList);

        Person expected = person;
        Person actual = linkedList.get(2);

        Assert.assertEquals(expected, actual);
    }


}










