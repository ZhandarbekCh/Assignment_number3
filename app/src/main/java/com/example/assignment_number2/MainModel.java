package com.example.assignment_number2;

public class MainModel {

    String Cost,Description,Title,burl;

    MainModel(){

    }
    public MainModel(String cost, String description, String title, String burl) {
        Cost = cost;
        Description = description;
        Title = title;
        this.burl = burl;
    }

    public String getCost() {
        return Cost;
    }

    public String getDescription() {
        return Description;
    }

    public String getTitle() {
        return Title;
    }

    public String getBurl() {
        return burl;
    }

    public void setCost(String cost) {
        Cost = cost;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setBurl(String burl) {
        this.burl = burl;
    }
}
