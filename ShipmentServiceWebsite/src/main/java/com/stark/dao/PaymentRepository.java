package com.stark.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.stark.pojos.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
