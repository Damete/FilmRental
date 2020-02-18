package Code;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="Rental")
public class Rental {

		@Id
		@Column(name="rental_id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int rental_id;
		
		//Foreign KEY!
		@ManyToOne(fetch = FetchType.LAZY)
		private int customer_id;
		
		@Column(name="rental_date")
		private Date rental_date;
		
		@Column(name="return_date")
		private Date return_date;
		
		public Rental() {}

		public Rental(int rental_id, int customer_id, Date rental_date, Date return_date) {
			this.rental_id = rental_id;
			this.customer_id = customer_id;
			this.rental_date = rental_date;
			this.return_date = return_date;
		}

		public int getRental_id() {
			return rental_id;
		}

		public void setRental_id(int rental_id) {
			this.rental_id = rental_id;
		}

		public int getCustomer_id() {
			return customer_id;
		}

		public void setCustomer_id(int customer_id) {
			this.customer_id = customer_id;
		}

		public Date getRental_date() {
			return rental_date;
		}

		public void setRental_date(Date rental_date) {
			this.rental_date = rental_date;
		}

		public Date getReturn_date() {
			return return_date;
		}

		public void setReturn_date(Date return_date) {
			this.return_date = return_date;
		}
		
		
}
