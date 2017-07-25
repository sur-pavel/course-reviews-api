package com.teamhouse.review;

import com.teamhouse.core.BaseEntity;

import javax.persistence.Entity;

@Entity
public class Review extends BaseEntity{

    protected Review() {
        super();
    }

    private int rating;
    private String description;

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
