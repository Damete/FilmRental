package Code;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Payment")
public class Payment {
	
	@Id
	@Column(name="payment_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int payment_id;
	
	@Id
	@Column(name="rental_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rental_id;
	
	@Column(name="amount")
	private Double amount;
	
	@Column(name="payment_date")
	private Date payment_date;
	
	public Payment() {}

	public Payment(int payment_id, int rental_id, Double amount, Date payment_date) {
		this.payment_id = payment_id;
		this.rental_id = rental_id;
		this.amount = amount;
		this.payment_date = payment_date;
	}

	public int getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}

	public int getRental_id() {
		return rental_id;
	}

	public void setRental_id(int rental_id) {
		this.rental_id = rental_id;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getPayment_date() {
		return payment_date;
	}

	public void setPayment_date(Date payment_date) {
		this.payment_date = payment_date;
	}
}
