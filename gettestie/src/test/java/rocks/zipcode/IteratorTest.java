package rocks.zipcode;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorTest {

    @Test
    public void listIteratorTest1() {
        Person person = new Person("Frank", 1985);
        Person person1 = new Person("Barney", 1900);
        Person person2 = new Person("Fred", 1901);
        Person person3 = new Person("Mac", 2005);

        List<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        ListIterator<Person> ltr = personList.listIterator();

        int count = 0;
        while (ltr.hasNext())   {
            ltr.next();
            ltr.set(person);
            count++;
            System.out.println(count);

        }

        Person expected = person;
        Person expected2 = person;
        Person actual = personList.get(0);
        Person actual2 = personList.get(3);

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void listIteratorTest2() {
        Person person = new Person("Frank", 1985);
        Person person1 = new Person("Barney", 1900);
        Person person2 = new Person("Fred", 1901);
        Person person3 = new Person("Mac", 2005);

        List<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        ListIterator<Person> ltr = personList.listIterator();

        int count = 0;
        while (ltr.hasNext())   {
            ltr.next();
            ltr.remove();
            count++;
            System.out.println(count);

        }

        int expected = 0;

        int actual = personList.size();


        Assert.assertEquals(expected, actual);
    }


}

