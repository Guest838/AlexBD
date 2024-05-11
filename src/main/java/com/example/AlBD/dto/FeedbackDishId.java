package com.example.AlBD.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@Embeddable
public class FeedbackDishId implements java.io.Serializable {
    private static final long serialVersionUID = -4240523079025492569L;
    @NotNull
    @Column(name = "ID_Dish", nullable = false)
    private Integer idDish;

    @NotNull
    @Column(name = "ID_Feedback", nullable = false)
    private Integer idFeedback;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        FeedbackDishId entity = (FeedbackDishId) o;
        return Objects.equals(this.idDish, entity.idDish) &&
                Objects.equals(this.idFeedback, entity.idFeedback);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDish, idFeedback);
    }

}