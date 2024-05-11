package com.example.AlBD;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Dish_with_Group")
public class DishWithGroup {
    @EmbeddedId
    private DishWithGroupId id;

    @MapsId("idDish")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Dish", nullable = false)
    private Dish idDish;

    @MapsId("idGroup")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Group", nullable = false)
    private GroupDish idGroup;

}