package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestNewStudents {
    @Test
    public void testStudent(){
        Students students =new Students();
        Person person =students.findById(2);
        Assert.assertTrue(students.contains(person));

    }
    @Test
    public void testStudent2(){
        Students students =new Students();
        Person person1 =students.findById(3);
        Assert.assertFalse(students.contains(person1));
    }

}
