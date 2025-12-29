 package com.example.MoviesApi.Entity.copy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Sports")
public class Sports {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String country;
	private String best_perfomance;
	private String role;
	private String battingStyle;
	private String bowlingStyle;
	private int matches;
	private int runs;
	private int wickets;
	private int centuries;
	private double average;
	private String imageUrl;
	private String videoUrl;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getBest_perfomance() {
		return best_perfomance;
	}
	public void setBest_perfomance(String best_perfomance) {
		this.best_perfomance = best_perfomance;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getBattingStyle() {
		return battingStyle;
	}
	public void setBattingStyle(String battingStyle) {
		this.battingStyle = battingStyle;
	}
	public String getBowlingStyle() {
		return bowlingStyle;
	}
	public void setBowlingStyle(String bowlingStyle) {
		this.bowlingStyle = bowlingStyle;
	}
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public int getCenturies() {
		return centuries;
	}
	public void setCenturies(int centuries) {
		this.centuries = centuries;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getVideoUrl() {
		return videoUrl;
	}
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	public Sports(Long id, String name, String country, String best_perfomance, String role, String battingStyle,
			String bowlingStyle, int matches, int runs, int wickets, int centuries, double average, String imageUrl,
			String videoUrl) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.best_perfomance = best_perfomance;
		this.role = role;
		this.battingStyle = battingStyle;
		this.bowlingStyle = bowlingStyle;
		this.matches = matches;
		this.runs = runs;
		this.wickets = wickets;
		this.centuries = centuries;
		this.average = average;
		this.imageUrl = imageUrl;
		this.videoUrl = videoUrl;
	}
	public Sports() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
 
	
}
