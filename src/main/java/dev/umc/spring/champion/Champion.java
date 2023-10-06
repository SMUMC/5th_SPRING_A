package dev.umc.spring.champion;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor
public class Champion {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
