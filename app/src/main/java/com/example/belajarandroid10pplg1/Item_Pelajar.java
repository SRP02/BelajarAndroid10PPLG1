package com.example.belajarandroid10pplg1;

public class Item_Pelajar {
    private String name;
    private String imageResource;
    private String Absen;
    private String Alamat;

    public String getImageResource() {
        return imageResource;
    }


    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setImageResource(String imageResource) {
        this.imageResource = imageResource;
    }

    public void setAbsen(String absen) {
        this.Absen = absen;
    }



//    public Item_Pelajar(String name, int imageResource, String attendanceDescription) {
//        this.name = name;
//        this.imageResource = imageResource;
//        this.attendanceDescription = attendanceDescription;
//    }

    public String getName() {
        return name;
    }


    public String getAbsen() {
        return Absen;
    }
}
