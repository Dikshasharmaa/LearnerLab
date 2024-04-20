package io.zipcoder.interfaces;

public class Instructors extends People{
    private static final Instructors Instance = new Instructors();
    public Instructors(){
        addPerson(new Instructor(1,"Dollio"));
        addPerson(new Instructor(2,"Kris"));

    }
    public static  Instructors getInstance(){
        return Instance;
    }


}
