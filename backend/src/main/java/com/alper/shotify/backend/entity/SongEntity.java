package com.alper.shotify.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "songs")
public class SongEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long songId;

    @Column(name = "Title")
    private String songTitle;

    @Column(name = "Artist")
    private String songArtist;

    @Column(name = "URL")
    private String songUrl;

    @Column(name = "Lyrics")
    private String lyrics;

    @ManyToMany(mappedBy = "songs")
    private List<RecommendationEntity> recommendations;
}
