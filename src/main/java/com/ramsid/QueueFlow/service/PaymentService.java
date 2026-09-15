package com.ramsid.QueueFlow.service;

import com.ramsid.QueueFlow.model.Payment;

import java.util.List;

public interface PaymentService {

    Payment createPayment(Payment payment);

    Payment getPaymentById(Long paymentId);

    List<Payment> getAllPayments();

    List<Payment> getPaymentsByBookingId(Long bookingId);

    Payment updatePayment(Payment payment);

    void deletePayment(Long paymentId);
}