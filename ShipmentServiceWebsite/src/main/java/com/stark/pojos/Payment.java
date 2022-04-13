package com.stark.pojos;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "payment")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class Payment extends BaseEntity {
	@Column(length = 10)
	public String location;
	
	@OneToOne
	@JoinColumn(name="shipment_id")
	private Shipment shipment;
}
