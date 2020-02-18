package Code;

import java.util.Date;

public class Film {
	
	private int film_id;
	
	private String title;
	
	private String description;
	
	private Date release_year;
	
	private String language;
	
	private Date rental_duration;
	
	private int rental_rate;
	
	private Double length;
	
	private Double replacement_cost;
	
	private Double rating;
	
	public Film() {}

	public Film(int film_id, String title, String description, Date release_year, String language, Date rental_duration,
			int rental_rate, Double length, Double replacement_cost, Double rating) {
		this.film_id = film_id;
		this.title = title;
		this.description = description;
		this.release_year = release_year;
		this.language = language;
		this.rental_duration = rental_duration;
		this.rental_rate = rental_rate;
		this.length = length;
		this.replacement_cost = replacement_cost;
		this.rating = rating;
	}

	public int getFilm_id() {
		return film_id;
	}

	public void setFilm_id(int film_id) {
		this.film_id = film_id;
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

	public Date getRelease_year() {
		return release_year;
	}

	public void setRelease_year(Date release_year) {
		this.release_year = release_year;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Date getRental_duration() {
		return rental_duration;
	}

	public void setRental_duration(Date rental_duration) {
		this.rental_duration = rental_duration;
	}

	public int getRental_rate() {
		return rental_rate;
	}

	public void setRental_rate(int rental_rate) {
		this.rental_rate = rental_rate;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getReplacement_cost() {
		return replacement_cost;
	}

	public void setReplacement_cost(Double replacement_cost) {
		this.replacement_cost = replacement_cost;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}
}