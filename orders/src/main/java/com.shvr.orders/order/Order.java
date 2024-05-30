package com.shvr.orders.order;

import com.shvr.orders.orderLine.OrderLine;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;
@Data
@Getter
public class Order {
    private LocalDateTime date;
    private long Id;
    private List<OrderLine> orderLines;


}
