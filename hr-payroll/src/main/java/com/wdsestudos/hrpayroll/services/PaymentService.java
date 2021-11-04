package com.wdsestudos.hrpayroll.services;

import com.wdsestudos.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {
        return new Payment("Bob",200.00, days);
    }
}
