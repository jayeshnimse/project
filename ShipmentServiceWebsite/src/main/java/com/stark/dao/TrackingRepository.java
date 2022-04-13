package com.stark.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stark.pojos.Tracking;

public interface TrackingRepository extends JpaRepository<Tracking, Integer> {

}
