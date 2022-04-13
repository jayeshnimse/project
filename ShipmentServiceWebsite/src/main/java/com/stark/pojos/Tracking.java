package com.stark.pojos;

import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "tracking")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class Tracking extends BaseEntity{

	@Column(name = "in_time", length = 20)
	public String inTime;

	@Column(name = "out_time", length = 20)
	public String outTime;
	
	@Column( length = 20)
	public String locaton;
	
	@Column(name = "transfer_mode", length = 20)
	public String Mode;
	
	@OneToOne
	@JoinColumn(name="shipment_id")
	private Shipment shipment;

	public Tracking(String inTime, String outTime, String locaton, String mode) {
		super();
		this.inTime = inTime;
		this.outTime = outTime;
		this.locaton = locaton;
		Mode = mode;
	}

	public Tracking() {
		super();
	}
	
}
