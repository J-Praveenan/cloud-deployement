package com.cloud.PaymentService.service;

import com.cloud.PaymentService.model.PaymentRequest;
import com.cloud.PaymentService.model.PaymentResponse;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailsByOrderId(String orderId);
}
