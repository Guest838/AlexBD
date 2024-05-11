package com.example.AlBD;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Feedback_Dish")
public class FeedbackDish {
    @EmbeddedId
    private FeedbackDishId id;

    @MapsId("idDish")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Dish", nullable = false)
    private Dish idDish;

    @MapsId("idFeedback")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Feedback", nullable = false)
    private Feedback idFeedback;

}