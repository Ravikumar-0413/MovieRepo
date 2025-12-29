package com.example.MoviesApi.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="kids")
public class Kids {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String title;

    @Column(length = 1000)
    private String description;

    private String genre;

    private String language;

    private int releaseyear;

    private double rating;

    private String posterUrl;

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

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public Kids(Long id, String title, String description, String genre, String language, int releaseyear,
			double rating, String posterUrl, String videoUrl) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.genre = genre;
		this.language = language;
		this.releaseyear = releaseyear;
		this.rating = rating;
		this.posterUrl = posterUrl;
		this.videoUrl = videoUrl;
	}

	public Kids() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Kids [id=" + id + ", title=" + title + ", description=" + description + ", genre=" + genre
				+ ", language=" + language + ", releaseyear=" + releaseyear + ", rating=" + rating + ", posterUrl="
				+ posterUrl + ", videoUrl=" + videoUrl + "]";
	}
    
}
