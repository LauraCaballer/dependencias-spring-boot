package com.javatechie.docs;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "ORDER_TB")
public class Order {
    @Id
    private int orderId;
    private String name;
    private int quantity;
    private double price;

    public Order(int orderId, String name, int quantity, double price) {
        this.orderId = orderId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}
