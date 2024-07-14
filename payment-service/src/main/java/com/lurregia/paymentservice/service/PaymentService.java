package com.lurregia.paymentservice.service;

import com.lurregia.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
