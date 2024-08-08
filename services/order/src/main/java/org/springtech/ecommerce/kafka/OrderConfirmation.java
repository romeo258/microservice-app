package org.springtech.ecommerce.kafka;

import org.springtech.ecommerce.customer.CustomerResponse;
import org.springtech.ecommerce.order.PaymentMethod;
import org.springtech.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
