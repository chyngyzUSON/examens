package com.book.task1.entity;

import lombok.*;

import javax.persistence.*;
import java.net.URL;

@Entity
@Table(name = "online_platform")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Ticket extends Business {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "website", unique = true)
    private URL website;

    @Column(name = "payment_ways")
    private String paymentWays;
}
