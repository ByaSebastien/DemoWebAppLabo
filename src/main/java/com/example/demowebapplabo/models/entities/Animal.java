package com.example.demowebapplabo.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity @Builder @AllArgsConstructor @NoArgsConstructor @Getter @Setter
public class Animal implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String name;
}
