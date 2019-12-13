package com.improving;

import javax.persistence.*;

@Entity(name = "movies")
public class Movies {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name="Movie_Id")
    private Integer movieId;

    @Column(name="Title")
    private String title;

    @Column(name="Year")
    private Integer year;

    @Column(name="Director")
    private String director;

    @Column(name="Producer")
    private String producer;

    @Column(name="Tomato_Rating")
    private Integer tomatoRating;


    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Integer getTomatoRating() {
        return tomatoRating;
    }

    public void setTomatoRating(Integer tomatoRating) {
        this.tomatoRating = tomatoRating;
    }

    public String toString() {
        return movieId + ": " + title;
    }
}
