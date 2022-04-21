package com.wevibe.app.dto;

import java.time.LocalDateTime;
import java.util.List;

public class Transaction {
    private List<Ticket> tickets;
    private User buyer;
    private LocalDateTime purchaseTime;
    private Double summaryCost;
}
