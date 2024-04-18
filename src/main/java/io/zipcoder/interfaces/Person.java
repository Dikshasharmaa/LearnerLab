package io.zipcoder.interfaces;

public class Person {
    final long ID;
    private String name;

    public Person(long id, String name) {
        ID = id;
        this.name = name;
    }

    public long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
