package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {


    @Test
    public void comparableTest1() {
        Person person = new Person("Frank", 1985);
        Person person1 = new Person("Barney", 1900);
        Person person2 = new Person("Fred", 1901);
        Person person3 = new Person("Mac", 2005);

        List<Person> personArrayList = new ArrayList<>();

        personArrayList.add(person);
        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);

        Collections.sort(personArrayList, Collections.reverseOrder());

        Person expected = person3;
        Person actual = personArrayList.get(0);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void comparableTest2() {
        Person person = new Person("Frank", 1985);
        Person person1 = new Person("Barney", 1900);
        Person person2 = new Person("Fred", 1901);
        Person person3 = new Person("Mac", 2005);

        List<Person> personArrayList = new ArrayList<>();

        personArrayList.add(person3);
        personArrayList.add(person2);
        personArrayList.add(person1);
        personArrayList.add(person);

        Collections.sort(personArrayList);

        Person expected = person;
        Person actual = personArrayList.get(0);

        Assert.assertEquals(expected, actual);
    }

}
