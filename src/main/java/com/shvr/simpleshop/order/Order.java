package com.shvr.simpleshop.order;

import com.shvr.simpleshop.orderLine.OrderLine;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private LocalDateTime date;
    private int number;
    private List<OrderLine> orderLines;


}
