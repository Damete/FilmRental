package Code;

import java.util.Date;

public class Payment {
	
	private int payment_id;
	
	private int rental_id;
	
	private Double amount;
	
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
