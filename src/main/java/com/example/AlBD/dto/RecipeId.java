package com.example.AlBD.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serial;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class RecipeId implements java.io.Serializable {
    @Serial
    private static final long serialVersionUID = -2108026040895857231L;
    @NotNull
    @Column(name = "ID_Dish", nullable = false)
    private Integer idDish;

    @NotNull
    @Column(name = "ID_Product", nullable = false)
    private Integer idProduct;

    @NotNull
    @Column(name = "Cooking_Way_id", nullable = false)
    private Integer cookingWayId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        RecipeId entity = (RecipeId) o;
        return Objects.equals(this.cookingWayId, entity.cookingWayId) &&
                Objects.equals(this.idProduct, entity.idProduct) &&
                Objects.equals(this.idDish, entity.idDish);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cookingWayId, idProduct, idDish);
    }

}