package com.example.student.myapplication;

public class HoaHau {
    String name;
    int namSinhl;
    int img,img2;
    public HoaHau(){

    }

    public HoaHau(String name, int namSinhl) {
        this.name = name;
        this.namSinhl = namSinhl;
    }

    public HoaHau(String name, int namSinhl, int img, int img2) {
        this.name = name;
        this.namSinhl = namSinhl;
        this.img = img;
        this.img2 = img2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNamSinhl() {
        return namSinhl;
    }

    public void setNamSinhl(int namSinhl) {
        this.namSinhl = namSinhl;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getImg2() {
        return img2;
    }

    public void setImg2(int img2) {
        this.img2 = img2;
    }

    @Override
    public String toString() {
        return "HoaHau{" +
                "name='" + name + '\'' +
                ", namSinhl=" + namSinhl +
                ", img=" + img +
                ", img2=" + img2 +
                '}';
    }
}
