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
public class DishWithGroupId implements java.io.Serializable {
    private static final long serialVersionUID = -2492782289174356230L;
    @NotNull
    @Column(name = "ID_Dish", nullable = false)
    private Integer idDish;

    @NotNull
    @Column(name = "ID_Group", nullable = false)
    private Integer idGroup;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DishWithGroupId entity = (DishWithGroupId) o;
        return Objects.equals(this.idGroup, entity.idGroup) &&
                Objects.equals(this.idDish, entity.idDish);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idGroup, idDish);
    }

}