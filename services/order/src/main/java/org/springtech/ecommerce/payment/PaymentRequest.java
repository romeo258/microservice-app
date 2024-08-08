package org.springtech.ecommerce.payment;

import org.springtech.ecommerce.customer.CustomerResponse;
import org.springtech.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
