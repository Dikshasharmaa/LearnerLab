package io.zipcoder.interfaces;

import java.util.List;

public class People <T> {
    List<T> personlist;

    public People(List<T> personlist) {
        this.personlist = personlist;
    }

    public void addPerson(T person){
        personlist.add(person);
    }
    public T findById(T id){
        for(int i =0;i<personlist.size();i++){
            if(personlist.get(i) == id){
                return personlist.get(i);
            }
        }
        return null;
    }



}
