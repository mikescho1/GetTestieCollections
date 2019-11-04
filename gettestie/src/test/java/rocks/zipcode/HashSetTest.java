package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    @Test
    public void hashSetTest1() {
        Person person = new Person("Frank", 1985);
        Person person1 = new Person("Barney", 1900);
        Person person2 = new Person("Fred", 1901);
        Person person3 = new Person("Mac", 2005);

        HashSet<Person> hashSet = new HashSet<Person>();
        hashSet.add(person);
        hashSet.add(person1);
        hashSet.add(person2);
        hashSet.add(person3);

        ArrayList<Person> personArrayList = new ArrayList<>();
        Iterator<Person> persIt = hashSet.iterator();
        while (persIt.hasNext())    {
            int i = 0;
            personArrayList.add(persIt.next());
            System.out.println(personArrayList.get(i));
            i++;
        }
        int expectedInt = 4;
        int actualInt = hashSet.size();

        Assert.assertEquals(expectedInt, actualInt);

    }







}
