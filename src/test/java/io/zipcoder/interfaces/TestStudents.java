package io.zipcoder.interfaces;

import Interface.Learner;
import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test
    public void TestImplementationWithLearner(){
        Student student = new Student(2,"john",5.0);
        Assert.assertTrue(student instanceof Learner);
    }
    @Test
    public void TestImplementationWithPerson(){
        Student student = new Student(2,"john",5.0);
        Assert.assertTrue(student instanceof Person);
    }
    @Test
    public void TestLearn(){
        Student student = new Student(2,"john",5.0);
        student.learn(5);
        Double expected = 10.0;
        Assert.assertEquals(expected, student.getTotalStudyTime());
    }
}
