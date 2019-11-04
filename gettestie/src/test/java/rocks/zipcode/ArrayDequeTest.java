package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class ArrayDequeTest {


    @Test
    public void arrayDequeTest1() {
        Person person = new Person("Frank", 1985);
        Person person1 = new Person("Barney", 1900);
        Person person2 = new Person("Fred", 1901);
        Person person3 = new Person("Mac", 2005);

        ArrayDeque<Person> arrayDeque = new ArrayDeque<>();

        arrayDeque.add(person);
        arrayDeque.addFirst(person2);
        arrayDeque.addLast(person3);
        arrayDeque.addFirst(person1);

        Person expected1 = person1;
        Person expected4 = person3;

        Person actual1 = arrayDeque.getFirst();
        Person actual4 = arrayDeque.getLast();

        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected4, actual4);
    }

    @Test
    public void arrayDequeTest2() {
        Person person = new Person("Frank", 1985);
        Person person1 = new Person("Barney", 1900);
        Person person2 = new Person("Fred", 1901);
        Person person3 = new Person("Mac", 2005);

        ArrayDeque<Person> arrayDeque = new ArrayDeque<>();

        arrayDeque.addLast(person);
        arrayDeque.addLast(person1);
        arrayDeque.addLast(person2);
        arrayDeque.addLast(person3);
        arrayDeque.pop();                   //pop removes person from the first position.



        System.out.println(arrayDeque);
        Person expected = person3;
        Person actual = arrayDeque.peekLast();
        Person expected2 = person1;
        Person actual2 = arrayDeque.peekFirst();

        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected, actual);

    }













}
