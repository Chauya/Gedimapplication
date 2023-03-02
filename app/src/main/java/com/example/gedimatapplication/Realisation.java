package com.example.gedimatapplication;

public class Realisation {
    // Declaration attributs
    private Integer id;
    private String titre;
    private String description;
    private Integer nbGaimes;

    // Constructeur
    public Realisation(){
        this.id=0;
        this.titre="";
        this.description="";
        this.nbGaimes=0;
    }

    // Getter & Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNbGaimes() {
        return nbGaimes;
    }

    public void setNbGaimes(Integer nbGaimes) {
        this.nbGaimes = nbGaimes;
    }
}
