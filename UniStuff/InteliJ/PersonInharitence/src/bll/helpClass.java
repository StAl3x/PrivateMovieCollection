package bll;

import be.Person;

import java.util.ArrayList;
import java.util.List;

public class helpClass {


    //help method for searching with id
    public static Person searchPersonWithId(int id, List<Person> person){
        for(Person n : person){
            if(n.getId() == id){
                return n;
            }
            else if(n.getId() != id){
                System.out.println("Person with such ID does not exist");

            }
        }
        return null;
    }
    //help method for searching with class
    public static List<Person> searchPersonWithClass(Class<?> name, List<Person> persons){
        List <Person> only = new ArrayList<>();
        for(Person n :persons){
            if(n.getClass().equals(name)){
                only.add(n);
            }
        }
        return only;
    }
}
