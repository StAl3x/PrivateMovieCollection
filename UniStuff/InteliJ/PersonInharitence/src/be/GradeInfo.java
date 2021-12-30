package be;

public class GradeInfo {
    private final String subject;
    private final int grade;

    public GradeInfo(int grade, String subject, Student a) {
        this.grade = grade;
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "GradeInfo{" +
                "subject='" + subject + '\'' +
                ", grade=" + grade +
                '}';
    }


}

