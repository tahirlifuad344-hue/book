package com.example.bookapp.entitiy;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "book")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String title;


    private String author;

    private LocalDateTime publishDate;

}
