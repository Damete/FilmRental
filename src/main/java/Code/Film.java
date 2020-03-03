package Code;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="Film")
public class Film {
	
	@Id
	@Column(name="film_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int film_id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@Column(name="release_year")
	private int release_year;
	
	@Column(name="language")
	private String language;
	
	@Column(name="rental_duration")
	private int rental_duration;
	
	@Column(name="rental_date")
	private int rental_rate;
	
	@Column(name="length")
	private Double length;
	
	@Column(name="replacement_cost")
	private Double replacement_cost;
	
	@Column(name="rating")
	private Double rating;
	
	public Film() {}

	public Film(int film_id, String title, String description, int release_year, String language, int rental_duration,
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

	public int getRelease_year() {
		return release_year;
	}

	public void setRelease_year(int release_year) {
		this.release_year = release_year;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getRental_duration() {
		return rental_duration;
	}

	public void setRental_duration(int rental_duration) {
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
