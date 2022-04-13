package com.stark.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stark.pojos.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {

}
