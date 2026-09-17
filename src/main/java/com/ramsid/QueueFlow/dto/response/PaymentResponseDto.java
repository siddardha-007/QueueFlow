package com.ramsid.QueueFlow.dto.response;

import com.ramsid.QueueFlow.enums.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentResponseDto {

    private Long paymentId;

    private Long bookingId;

    private String transactionId;

    private BigDecimal amount;

    private PaymentStatus status;

    private String paymentMethod;
}
