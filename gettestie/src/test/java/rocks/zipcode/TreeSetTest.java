package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class TreeSetTest {
    @Test
    public void treeSetTest1() {
        Person person = new Person("Frank", 1985);
        Person person1 = new Person("Barney", 1900);
        Person person2 = new Person("Fred", 1901);
        Person person3 = new Person("Mac", 2005);

        Set<Person> personSet = new TreeSet<>();
        List<Person> personArrayList = new ArrayList<>();

        personArrayList.add(person);
        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);

        personSet.addAll(personArrayList);

        int expected = 4;
        int actual = personSet.size();


        Assert.assertEquals(expected, actual);
    }


    @Test
    public void treeSetTest2() {
        Person person = new Person("Frank", 1985);
        Person person1 = new Person("Barney", 1900);
        Person person2 = new Person("Fred", 1901);
        Person person3 = new Person("Mac", 2005);

        Set<Person> personSet = new TreeSet<>();
        personSet.add(person);

        boolean expected = false;
        boolean actual = personSet.isEmpty();



        Assert.assertFalse(actual);


    }

}
