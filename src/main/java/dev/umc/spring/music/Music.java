package dev.umc.spring.music;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity @Table
@NoArgsConstructor @Getter
public class Music {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long musicId;

    private String musicName;

    private String artistName;

    private String musicLyrics;

}
