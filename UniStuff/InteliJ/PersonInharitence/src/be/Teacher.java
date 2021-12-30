package be;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends  Person{
    private final List<String> subjects = new ArrayList<>();
    private final String initials;
    private double salary;

    public Teacher(int id, String name, String email, double salary, String initials) {
        super(id, name, email);
        this.initials = initials;
        this.salary = salary;
    }


    public List<String> getSubjects() {
        return subjects;
    }

    public String getInitials() {
        return initials;
    }

    public double getSalary() {
        return salary;
    }

    public void addSubject(String subject){
        subjects.add(subject);
    }

    public void setSalary(double newSalary){
        this.salary = newSalary;
    }

    @Override
    public String toString() {
        return "Teacher"+ "\n"+
                "ID: "+ this.getId()+
                ", Name: " + this.getName()+
                ", Email: " + this.getEmail()+
                ", Initials: " + this.getInitials()+
                ", Salary " + getSalary()+
                "\n";
    }


}

