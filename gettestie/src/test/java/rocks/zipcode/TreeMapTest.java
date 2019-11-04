package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

public class TreeMapTest {

    @Test
    public void treeMapTest1() {
        Person person = new Person("Frank", 1985);
        Person person1 = new Person("Barney", 1900);
        Person person2 = new Person("Fred", 1901);
        Person person3 = new Person("Mac", 2005);

        TreeMap<Integer, Person> treeMap = new TreeMap<>();

        treeMap.put(1985, person);
        treeMap.put(1901, person2);

        String expected1 = "Frank";
        String actual1 = treeMap.get(1985).getName();

        String expected2 = "Fred";
        String actual2 = treeMap.get(1901).getName();

        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
    }








}
