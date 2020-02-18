package Code;

import javax.persistence.*;

@Entity
@Table(name="Category")
public class Category {
	
	@Id
	@Column(name="id_category")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_category;
	
	@Column(name="Name")
	private String name;
	
	public Category() {}
	
	public Category(int id_category, String name) {
		this.id_category = id_category;
		this.name = name;
	}

	public int getId_category() {
		return id_category;
	}

	public void setId_category(int id_category) {
		this.id_category = id_category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
