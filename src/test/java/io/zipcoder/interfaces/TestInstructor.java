package io.zipcoder.interfaces;

import Interface.Teacher;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementationWithTeacher(){
        Instructor instructor = new Instructor(2,"john");
        Assert.assertTrue(instructor instanceof Teacher);
    }
    @Test
    public void testImplementationWithPerson(){
        Instructor instructor = new Instructor(2,"john");
        Assert.assertTrue(instructor instanceof Person);
    }
    @Test
    public void testTeach(){
        Instructor instructor = new Instructor(2,"john");
        instructor;
    }

}
