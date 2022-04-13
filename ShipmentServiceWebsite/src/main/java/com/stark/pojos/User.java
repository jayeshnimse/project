package com.stark.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class User extends BaseEntity {

	public User(String name, String email, long mobile, String city, String password, Role role) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.city = city;
		this.password = password;
		this.role = role;
	}

	public User() {
		super();
	}

	@Column(length = 30)
	public String name;
	@Column(length = 20)
	public String email;
	@Column(length = 10)
	public long mobile;
	@Column(length = 15)
	public String city;
	@Column(length = 10)
	public String password;
	@Enumerated(EnumType.STRING)
	public Role role;

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "customer")
	private Feedback feedback;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private List<Shipment> shipments = new ArrayList<Shipment>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Feedback getFeedback() {
		return feedback;
	}

	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}

	public List<Shipment> getShipments() {
		return shipments;
	}

	public void setShipments(List<Shipment> shipments) {
		this.shipments = shipments;
	}

}
