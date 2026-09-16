package com.ramsid.QueueFlow.repository;

import com.ramsid.QueueFlow.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

    List<Payment> findByBookingBookingId(Long bookingId);
}