package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class VectorTest {

    @Test
    public void vectorTest1() {
        Person person = new Person("Frank", 1985);
        Person person1 = new Person("Barney", 1900);
        Person person2 = new Person("Fred", 1901);
        Person person3 = new Person("Mac", 2005);

        Vector<Person> vector = new Vector<>();
        Vector<Person> vector2 = new Vector<>();


        vector.add(person);
        vector.add(person1);
        vector.add(person2);
        vector.add(person3);

        vector2 = (Vector) vector.clone();

        int expectedInt = 4;
        int actualInt = vector2.size();

        Person expectedPerson = person2;
        Person personActual = vector2.get(2);


        Assert.assertEquals(expectedInt, actualInt);
        Assert.assertEquals(expectedPerson, personActual);
    }


    @Test
    public void vectorTest2() {
        Person person = new Person("Frank", 1985);
        Person person1 = new Person("Barney", 1900);
        Person person2 = new Person("Fred", 1901);
        Person person3 = new Person("Mac", 2005);

        Vector<Person> vector = new Vector<>();
        Vector<Person> vector2 = new Vector<>();

        vector.add(person);
        vector.add(person1);
        vector.add(person2);
        vector.add(person3);

        int expected = 2;
        int actual = vector.indexOf(person2);

        Assert.assertEquals(expected, actual);


    }
}







