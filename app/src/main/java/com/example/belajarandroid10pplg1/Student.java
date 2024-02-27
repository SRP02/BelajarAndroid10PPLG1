package com.example.belajarandroid10pplg1;

public class Student {
    private String name;
    private int imageResource;
    private String attendanceDescription;

    public Student(String name, int imageResource, String attendanceDescription) {
        this.name = name;
        this.imageResource = imageResource;
        this.attendanceDescription = attendanceDescription;
    }

    public String getName() {
        return name;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getAttendanceDescription() {
        return attendanceDescription;
    }
}
