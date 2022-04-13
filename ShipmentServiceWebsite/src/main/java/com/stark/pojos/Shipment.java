package com.stark.pojos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "shipments")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Shipment extends BaseEntity {

	public Shipment() {
		super();
	}

	public Shipment(String source, String destination, String weight, String size, long mobile,String charges) {
		super();
		this.source = source;
		this.destination = destination;
		this.weight = weight;
		this.size = size;
		this.mobile = mobile;
		this.charges=charges;
	}

	@Column(length = 20)
	public String source;
	@Column(length = 20)
	public String destination;
	@Column(length = 30)
	public String weight;
	@Column(length = 30)
	public String size;
	@Column(name = "destination_mobile", length = 10)
	public long mobile;
	@Column(length = 8)
	public String charges;
	
	
	@ManyToOne
	@JoinColumn(name="cust_id")
	private User customer;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "shipment")
	private Feedback feedback; 
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "shipment")
	private Tracking tracking;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "shipment")
	private Payment payment;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getWeight() {
		return weight;
	}
	
	

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getCharges() {
		return charges;
	}

	public void setCharges(String charges) {
		this.charges = charges;
	}

	public User getCustomer() {
		return customer;
	}

	public void setCustomer(User customer) {
		this.customer = customer;
	}

	public Feedback getFeedback() {
		return feedback;
	}

	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}

	public Tracking getTracking() {
		return tracking;
	}

	public void setTracking(Tracking tracking) {
		this.tracking = tracking;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

}
