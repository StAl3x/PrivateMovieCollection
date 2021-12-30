package be;


import java.util.ArrayList;
import java.util.List;
import bll.helpClass;

public class PersonManager {
    private final List<Person> persons = new ArrayList<>();

    public PersonManager() {

    }

    public Person getPerson(int id){
        return (helpClass.searchPersonWithId(id, persons));
    }

    public void addPerson(Person per){
        persons.add(per);
    }

    public void removePerson(int id){
        persons.remove(helpClass.searchPersonWithId(id, persons));
    }

    public List<Person> getAllPersons() {
        return persons;
    }

    public List<Person> getAllStudents(){
        return helpClass.searchPersonWithClass(Student.class, persons);
    }

    public List<Person> getAllTeachers(){
        return helpClass.searchPersonWithClass(Teacher.class, persons);
    }




}
