package com.example.useaapp.student.student_studyPlan.year1;

public class SemesterStudyPlan {
    private final String No,Subject,Hour,Credit;
    public SemesterStudyPlan(String no, String subject, String hour, String credit) {
        this.No = no;
        this.Subject = subject;
        this.Hour = hour;
        this.Credit = credit;
    }

    public String getNo() {
        return No;
    }

    public String getSubject() {
        return Subject;
    }

    public String getHour() {
        return Hour;
    }

    public String getCredit() {
        return Credit;
    }

}