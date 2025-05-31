package com.tutorial.feeservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "fee")
@NoArgsConstructor
@AllArgsConstructor
public class FeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int feeBase;
    private int bookingReservationMin;
    private int round;
}


