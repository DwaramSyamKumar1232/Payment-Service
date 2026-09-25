package com.jsf.training.paymentservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @GetMapping("/status")
    public String status() {

        return "Payment Service Running";

    }
}