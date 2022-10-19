package com.nestdigital.recepie_backend.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recepie")
public class RecepieModel {

    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String description;
    private String preaparedby;
    private String rating;

    public RecepieModel(int id, String title, String description, String preaparedby, String rating) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.preaparedby = preaparedby;
        this.rating = rating;
    }

    public RecepieModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreaparedby() {
        return preaparedby;
    }

    public void setPreaparedby(String preaparedby) {
        this.preaparedby = preaparedby;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
