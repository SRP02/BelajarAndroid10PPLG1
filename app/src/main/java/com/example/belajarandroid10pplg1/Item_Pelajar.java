package com.example.belajarandroid10pplg1;

public class Item_Pelajar {
    private String name;
    private int imageResource;
    private String attendanceDescription;

    public Item_Pelajar(String name, int imageResource, String attendanceDescription) {
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
