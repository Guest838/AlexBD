package com.example.AlBD.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="DishWithGroup")
@Table(name="Dish_With_Group", catalog = "CookBook", schema = "dbo")
public class DishWithGroup extends AbstractDto{
    @EmbeddedId
    private DishWithGroupId id;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @MapsId("idDish")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Dish", nullable = false)
    private Dish idDish;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @MapsId("idGroup")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Group", nullable = false)
    private GroupDish idGroup;

}