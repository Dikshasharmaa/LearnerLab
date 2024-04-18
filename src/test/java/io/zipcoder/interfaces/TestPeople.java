package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    @Test
    public void testAddPeople(){
        People people = new People();
        Person person1 = new Person(1,"diksha");
        people.addPerson(person1);
        Assert.assertEquals(true, people.contains(person1));
    }
    @Test
    public void TestRemovePeople(){
        People people = new People();
        Person person1 = new Person(1,"diksha");
        people.addPerson(person1);
        people.remove(person1);
        Assert.assertFalse(people.contains(person1));
    }
    @Test
    public void testFindById(){
        Person person = new Person(1,"diksha");
        Person person1 = new Person(2,"sharma");
        People people = new People();
        people.addPerson(person);
        people.addPerson(person1);
        Assert.assertEquals(person1,people.findById(2));

    }

}
