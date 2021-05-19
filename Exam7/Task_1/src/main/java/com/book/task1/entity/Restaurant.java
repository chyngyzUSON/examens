package com.book.task1.entity;

import lombok.*;

import javax.persistence.*;
import java.net.URL;


@Entity
@Table(name = "restaurant")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Restaurant extends Business {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "brand_dish")
    private String brandDish;

    @Column(name = "website", unique = true)
    private URL website;
}
