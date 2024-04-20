package io.zipcoder.interfaces;

import Interface.Teacher;

import java.util.Map;

public class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();

    public static ZipCodeWilmington getINSTANCE() {
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){

    }
    public void hostLecture(long id, double numberOfHours){

    }
    public Map<Student,Double> getStudyMap(){
        return null;
    }


}
