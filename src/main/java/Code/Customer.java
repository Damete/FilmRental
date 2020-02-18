package Code;

import java.util.Date;

public class Customer {

	
	private int customer_id;
	
	private String first_name;
	
	private String last_name;
	
	private Boolean active;
	
	private Date creation_date;
	
	public Customer() {}

	public Customer(int customer_id, String first_name, String last_name, Boolean active, Date creation_date) {
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

	public Date getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(Date creation_date) {
		this.creation_date = creation_date;
	}
}
