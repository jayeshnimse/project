package com.stark.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stark.pojos.Shipment;

public interface ShipmentRepository extends JpaRepository<Shipment, Integer> {

}
