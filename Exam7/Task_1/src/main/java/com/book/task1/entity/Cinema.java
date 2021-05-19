package com.book.task1.entity;

import lombok.*;

import javax.persistence.*;
import java.net.URL;

@Entity
@Table(name = "cinema")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Cinema extends Business {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "capacity")
    private Integer Capacity;

    @Column(name = "address")
    private String address;

    @Column(name = "website", unique = true)
    private URL website;


}
