package Code;

import javax.persistence.*;

@Entity
@Table(name="Customer")
public class Customer {
	
	@Id
	@Column(name="customer_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customer_id;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="Status")
	private Boolean active;
	
	@Column(name="creation_date")
	private String creation_date;
	
	public Customer() {}

	public Customer(int customer_id, String first_name, String last_name, Boolean active, String creation_date) {
		this.customer_id = customer_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.active = active;
		this.creation_date = creation_date;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
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

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(String creation_date) {
		this.creation_date = creation_date;
	}
}
