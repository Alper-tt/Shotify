package com.alper.shotify.backend.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RecommendationResponseDTO {
    private int recommendationId;
    private int photoId;
    private RecommendedSongsListResponseDTO songs;
}
