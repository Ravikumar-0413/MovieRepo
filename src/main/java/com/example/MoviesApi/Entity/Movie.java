package com.example.MoviesApi.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(length = 1000)
    private String description;

    private String genre;

    private String language;

    private int releaseyear;

    private int duration; // minutes

    private double rating;

    private String posterUrl;

    private String trailerUrl;

    private String videoUrl;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getReleaseyear() {
		return releaseyear;
	}

	public void setReleaseyear(int releaseyear) {
		this.releaseyear = releaseyear;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getPosterUrl() {
		return posterUrl;
	}

	public void setPosterUrl(String posterUrl) {
		this.posterUrl = posterUrl;
	}

	public String getTrailerUrl() {
		return trailerUrl;
	}

	public void setTrailerUrl(String trailerUrl) {
		this.trailerUrl = trailerUrl;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public Movie(Long id, String title, String description, String genre, String language, int releaseyear,
			int duration, double rating, String posterUrl, String trailerUrl, String videoUrl) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.genre = genre;
		this.language = language;
		this.releaseyear = releaseyear;
		this.duration = duration;
		this.rating = rating;
		this.posterUrl = posterUrl;
		this.trailerUrl = trailerUrl;
		this.videoUrl = videoUrl;
	}

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", description=" + description + ", genre=" + genre
				+ ", language=" + language + ", releaseyear=" + releaseyear + ", duration=" + duration + ", rating="
				+ rating + ", posterUrl=" + posterUrl + ", trailerUrl=" + trailerUrl + ", videoUrl=" + videoUrl + "]";
	}
	
     
    
}

