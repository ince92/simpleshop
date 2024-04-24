package com.shvr.orders.order;

import com.shvr.orders.orderLine.OrderLine;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class Order {
    private LocalDateTime date;
    private long Id;
    private List<OrderLine> orderLines;


}
