package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {
    @Before
    public void setUp(){};

    @After
    public void tearDown(){}

    @Test
    public void ArrayListTest1()    {
        Person person = new Person("Frank", 1985);
        Person person1 = new Person("Barney", 1900);
        Person person2 = new Person("Fred", 1901);
        ArrayList<Person> arrList = new ArrayList<>(0);

        arrList.add(person);
        arrList.add(person1);
        arrList.add(person2);

        Person expectedPerson = person;
        Person actualPerson = arrList.get(0);

        int expectedInt = 3;
        int actualInt = arrList.size();
        Assert.assertEquals(expectedPerson, actualPerson);
        Assert.assertEquals(expectedInt, actualInt);
    }

    @Test
    public void ArrayListTest2()    {
        Person person = new Person("Frank", 1985);
        Person person1 = new Person("Barney", 1900);
        Person person2 = new Person("Fred", 1901);


        ArrayList<Person> arrList = new ArrayList<Person>();
        arrList.add(person);
        arrList.add(person1);
        arrList.add(person2);

        arrList.remove(1);

        Person expectedPerson = person2;
        Person actualPerson = arrList.get(1);

        int expectedInt = 2;
        int actualInt = arrList.size();
        Assert.assertEquals(expectedPerson, actualPerson);
    }

    @Test
    public void ArrayListTest3() {
        Person person = new Person("Frank", 1985);
        Person person1 = new Person("Barney", 1900);
        Person person2 = new Person("Fred", 1901);
        Person person3 = new Person("Mac", 2005);


        ArrayList<Person> arrList = new ArrayList<Person>();
        arrList.add(person);
        arrList.add(person1);
        arrList.add(person2);
        arrList.add(person3);

        boolean removedPerson = arrList.remove(person1);
        int expectedInt = 3;
        int actualInt = arrList.size();
        Person expectedPerson = person2;
        Person actualPerson = arrList.get(1);

        Assert.assertEquals(expectedInt, actualInt);
        Assert.assertEquals(expectedPerson, actualPerson);
    }




}
