package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void testInstructors(){
        Instructors instructors =new Instructors();
        Instructor instructor = (Instructor) instructors.findById(2);
        Assert.assertTrue(instructors.contains(instructor));

    }
    @Test
    public void testInstructors2(){
        Instructors instructors =new Instructors();
        Instructor instructor1 = (Instructor) instructors.findById(3);
        Assert.assertFalse(instructors.contains(instructor1));
    }
}
