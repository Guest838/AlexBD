package com.example.AlBD.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="FeedbackDish")
@Table(name="Feedback_Dish", catalog = "CookBook", schema = "dbo")
public class FeedbackDish extends AbstractDto{
    @EmbeddedId
    private FeedbackDishId id;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @MapsId("idDish")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Dish", nullable = false)
    private Dish idDish;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @MapsId("idFeedback")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Feedback", nullable = false)
    private Feedback idFeedback;

}