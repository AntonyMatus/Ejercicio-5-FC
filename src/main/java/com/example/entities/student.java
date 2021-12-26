package com.example.entities;


import java.util.ArrayList;
import java.util.List;

public class student {

    private String name;
    private String country;
    private String city;
    private String phone;
    private String email;
    private String status_face_to_face;
    private boolean status_transfer;
    private String  profile_picture;
    private String  cv_document;

    List<label> labelsList = new ArrayList<>();

    public student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStatus_face_to_face(String status_face_to_face) {
        this.status_face_to_face = status_face_to_face;
    }

    public void setStatus_transfer(boolean status_transfer) {
        this.status_transfer = status_transfer;
    }

    public void setProfile_picture(String profile_picture) {
        this.profile_picture = profile_picture;
    }

    public void setCv_document(String cv_document) {
        this.cv_document = cv_document;
    }

    public void setLabelsList(List<label> labelsList) {
        this.labelsList = labelsList;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", status_face_to_face='" + status_face_to_face + '\'' +
                ", status_transfer=" + status_transfer +
                ", profile_picture='" + profile_picture + '\'' +
                ", cv_document='" + cv_document + '\'' +
                ", labelsList=" + labelsList +
                '}';
    }
}
