package com.example.useaapp.student.student_news;

public class ModelNews {
    private final String subject, date, due_date, time, room,creator,label;

    public ModelNews(String subject, String date, String due_date, String time, String room, String creator, String label) {
        this.subject = subject;
        this.date = date;
        this.due_date = due_date;
        this.time = time;
        this.room = room;
        this.creator = creator;
        this.label = label;
    }

    public String getSubject() {
        return subject;
    }

    public String getDate() {
        return date;
    }

    public String getDue_date() {
        return due_date;
    }

    public String getTime() {
        return time;
    }

    public String getRoom() {
        return room;
    }

    public String getCreator() {
        return creator;
    }

    public String getLabel() {
        return label;
    }
}