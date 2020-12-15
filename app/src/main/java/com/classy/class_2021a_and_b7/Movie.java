package com.classy.class_2021a_and_b7;

public class Movie {

    private String name = "";
    private String actors = "";
    private String content = "";
    private String starImageLink = "";
    private String imageLink = "";
    private int year = 0;
    private double stars = 0.0;
    private boolean forKids = true;

    public Movie() { }

    public String getName() {
        return name;
    }

    public Movie setName(String name) {
        this.name = name;
        return this;
    }

    public String getActors() {
        return actors;
    }

    public Movie setActors(String actors) {
        this.actors = actors;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Movie setContent(String content) {
        this.content = content;
        return this;
    }

    public String getStarImageLink() {
        return starImageLink;
    }

    public Movie setStarImageLink(String starImageLink) {
        this.starImageLink = starImageLink;
        return this;
    }

    public String getImageLink() {
        return imageLink;
    }

    public Movie setImageLink(String imageLink) {
        this.imageLink = imageLink;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Movie setYear(int year) {
        this.year = year;
        return this;
    }

    public double getStars() {
        return stars;
    }

    public Movie setStars(double stars) {
        this.stars = stars;
        return this;
    }

    public boolean isForKids() {
        return forKids;
    }

    public Movie setForKids(boolean forKids) {
        this.forKids = forKids;
        return this;
    }
}
