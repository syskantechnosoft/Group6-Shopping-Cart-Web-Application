package com.revature.shoppingcart.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Orders", //
        uniqueConstraints = { @UniqueConstraint(columnNames = "Order_Num") })
public class Order implements Serializable {

    private static final long serialVersionUID = -2576670215015463100L;

    @Id
    @Column(name = "ID", length = 50)
    private String id;

    @Column(name = "Order_Date", nullable = false)
    private Date orderDate;

    @Column(name = "Order_Num", nullable = false)
    private int orderNum;

    @Column(name = "Amount", nullable = false)
    private double amount;

    @Column(name = "Customer_Name", length = 255, nullable = false)
    private String customerName;

    @Column(name = "Customer_Address", length = 255, nullable = false)
    private String customerAddress;

    @Column(name = "Customer_Email", length = 128, nullable = false)
    private String customerEmail;

    @Column(name = "Customer_Phone", length = 128, nullable = false)
    private String customerPhone;
}
