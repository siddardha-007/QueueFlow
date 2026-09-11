package com.ramsid.QueueFlow.repository;

import com.ramsid.QueueFlow.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
