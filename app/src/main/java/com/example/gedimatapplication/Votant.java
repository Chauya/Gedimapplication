package com.example.gedimatapplication;

public class Votant {
    private String code = "";
    private String mail = "";
    private String dateUtilisation = "";
    private String dateAccord = "";

    // Constructor
    public Votant(){
        this.code = "";
        this.mail = "";
        this.dateUtilisation = "";
        this.dateAccord = "";
    }

    // Getter & Setter
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDateUtilisation() {
        return dateUtilisation;
    }

    public void setDateUtilisation(String dateUtilisation) {
        this.dateUtilisation = dateUtilisation;
    }

    public String getDateAccord() {
        return dateAccord;
    }

    public void setDateAccord(String dateAccord) {
        this.dateAccord = dateAccord;
    }
}
