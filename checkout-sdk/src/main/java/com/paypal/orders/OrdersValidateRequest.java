// This class was generated on Wed, 22 Aug 2018 20:49:06 PDT by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// OrdersValidateRequest.java
// @version 0.1.0-dev+904328-dirty
// @type request
// @data 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
// DO NOT EDIT
package com.paypal.orders;

import com.braintreepayments.http.*;
import java.util.*;
import java.util.stream.Collectors;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * Validates a payment method and checks it for contingencies.
 */
public class OrdersValidateRequest extends HttpRequest<Order> {

    public OrdersValidateRequest(String orderId) {
        super("/v2/checkout/orders/{order_id}/validate-payment-method?", "POST", Order.class);
        try {
            path(path().replace("{order_id}", URLEncoder.encode(String.valueOf(orderId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    
    public OrdersValidateRequest payPalClientMetadataId(String payPalClientMetadataId) {
        header("PayPal-Client-Metadata-Id", String.valueOf(payPalClientMetadataId));
        return this;
    }
    
    

    public OrdersValidateRequest requestBody(OrderActionRequest orderActionRequest) {
        super.requestBody(orderActionRequest);
        return this;
    }
}
