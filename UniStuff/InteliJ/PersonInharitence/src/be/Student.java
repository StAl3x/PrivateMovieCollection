package be;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person  {
    private final List<GradeInfo> gradeReport = new ArrayList<>();
    private final String education;

    public Student(int id, String name, String email, String education) {
        super(id, name, email);
        this.education = education;
    }


    public List<GradeInfo> getGradeReport() {
        return gradeReport;
    }

    public String getEducation() {
        return education;
    }

    public double getAverageGrade(){
        double gradeAverage =0;
        for(GradeInfo n : gradeReport){
            gradeAverage += n.getGrade();
            gradeAverage /= gradeReport.size();
        }
        return gradeAverage;
    }

    public int getGrade(String subject){

        for(GradeInfo n : gradeReport){
                if (n.getSubject().equals(subject)){
                     return n.getGrade();
                }
                else {
                    System.out.println("I do not have this subject mate");

                }
        }
        return 0;
    }

    public void addGrade(GradeInfo g){
        gradeReport.add(g);

    }


    @Override
    public String toString() {
        return "Student"+ "\n"+
                "ID: "+ this.getId()+
                ", Name: " + this.getName()+
                ", Email: " + this.getEmail()+
                ", Education: " + this.getEducation()+
                ", AVG: " + getAverageGrade()+
                "\n";

    }


}
