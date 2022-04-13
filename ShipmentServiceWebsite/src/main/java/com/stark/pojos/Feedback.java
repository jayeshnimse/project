package com.stark.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "feedback")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class Feedback extends BaseEntity{

	@Column(length = 1)
	public int rating;
	@Column(length = 50)
	public String suggestions;
	
	@OneToOne
	@JoinColumn(name="cust_id")
	private User customer;

	@OneToOne
	@JoinColumn(name="shipment_id")
	private Shipment shipment;

	public Feedback(int rating, String suggestions) {
		super();
		this.rating = rating;
		this.suggestions = suggestions;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getSuggestions() {
		return suggestions;
	}

	public void setSuggestions(String suggestions) {
		this.suggestions = suggestions;
	}

	public User getCustomer() {
		return customer;
	}

	public void setCustomer(User customer) {
		this.customer = customer;
	}

	public Shipment getShipment() {
		return shipment;
	}

	public void setShipment(Shipment shipment) {
		this.shipment = shipment;
	}

	public Feedback() {
		super();
	}

}
