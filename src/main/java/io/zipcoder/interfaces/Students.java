package io.zipcoder.interfaces;


public class Students extends People {
    private static final Students Instance = new Students();
    public Students(){
        addPerson(new Student(1,"john",5.0));
        addPerson(new Student(2,"tom",5.0));

    }
     public static  Students getInstance(){
         return Instance;
     }



}
