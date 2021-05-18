package com.itcourse.task2.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    public String password;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @Column(name = "registration_date")
    private LocalDate registrationDate;

    @Column(name = "contract_amount")
    private Integer contractAmount;
}
