package io.zipcoder.interfaces;

import Interface.Learner;
import Interface.Teacher;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementationWithTeacher(){
        Instructor instructor = new Instructor(2,"Kris");
        Assert.assertTrue(instructor instanceof Teacher);
    }
    @Test
    public void testImplementationWithPerson(){
        Instructor instructor = new Instructor(2,"Kris");
        Assert.assertTrue(instructor instanceof Person);
    }
    @Test
    public void testTeach(){
        Instructor instructor = new Instructor(2,"kris");
        Student student = new Student(1,"john",5.0);
        Student student1 = new Student(1,"tom",5.0);
        instructor.teach(student,20.00);
        Double expected = 25.0;
        Assert.assertEquals(expected, student.getTotalStudyTime());
    }
    @Test
    public void testLecture(){
        Instructor instructor = new Instructor(1,"Kris");
        Student student1 = new Student(1,"john",10.0);
        Student student2 = new Student(2,"tom",5.0);
        Learner[] learn = new Learner[]{student1,student2};
        instructor.lecture(learn,10.0);
        Assert.assertEquals(15.0,student1.getTotalStudyTime(),0.01);
        Assert.assertEquals(10.0, student2.getTotalStudyTime(),0.01);

        }

}
