package Code;

import javax.persistence.*;

@Entity
@Table(name="Actor")
public class Actor {

	@Id
	@Column(name="id_actor")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_actor;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	public Actor() {}

	public Actor(int id_actor, String first_name, String last_name) {
		this.id_actor = id_actor;
		this.first_name = first_name;
		this.last_name = last_name;
	}

	public int getId_actor() {
		return id_actor;
	}

	public void setId_actor(int id_actor) {
		this.id_actor = id_actor;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
}
