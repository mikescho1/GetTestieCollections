package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class HashMapTest {

    @Test
    public void hashMapTest1() {
        Person person = new Person("Frank", 1985);
        Person person1 = new Person("Barney", 1900);
        Person person2 = new Person("Fred", 1901);
        Person person3 = new Person("Mac", 2005);

        HashMap<Integer, Person> personHashMap = new HashMap();
        personHashMap.put(1985, person);

        Person expected = person;
        Person actual = personHashMap.get(1985);

        String expectedString = "Frank";
        String actualString = personHashMap.get(1985).getName();


        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expectedString, actualString);
    }

    @Test
    public void hashMapTest2() {
        Person person = new Person("Frank", 1985);
        Person person1 = new Person("Barney", 1900);
        Person person2 = new Person("Fred", 1901);
        Person person3 = new Person("Mac", 2005);

        HashMap<String, Person> personHashMap = new HashMap();
        personHashMap.put("Mac", person3);

        Person expected = person3;
        Person actual = personHashMap.get("Mac");

        int expectedInt = 2005;
        int actualInt = personHashMap.get("Mac").getYearOfBirth();


        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expectedInt, actualInt);
    }






}











