package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void TestConstructor(){
        Person person = new Person(23,"john");
        Assert.assertEquals(person.getID(), 23);
        Assert.assertEquals(person.getName(),"john");

    }
    @Test
    public void TestSetName(){
        Person person = new Person(23,"john");
        person.setName("tom");
        String expected = "tom";
        String actual = person.getName();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void TestId(){
        Person person = new Person(23,"john");
        long expected = 23;
        long actual = person.getID();
        Assert.assertEquals(expected,actual);

    }

}
