package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People <T extends Person> implements Iterable<T>{
    List<T> personlist = new ArrayList<>();

    public void addPerson(T person){
        personlist.add(person);
    }
    public T findById(long id){
        for(int i =0;i<personlist.size();i++){
            if(personlist.get(i).getID() == id){
                return personlist.get(i);
            }
        }
        return null;
    }
    public boolean contains(Person person){
        return personlist.contains(person);
    }
    public void remove(Person person){
        personlist.remove(person);
    }
    public void remove(long id){
        for(int i =0; i<personlist.size();i++){
            if(personlist.get(i).getID() == id){
                personlist.remove(i);
            }
        }
    }
    public void removeAll(){
        personlist.clear();
    }
    public void count(){
        personlist.size();
    }
    public void toArray(){
        personlist.toArray();
    }

    @Override
    public Iterator<T> iterator() {
        return personlist.iterator();
    }


}
